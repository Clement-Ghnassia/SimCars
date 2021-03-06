package CourseView;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.Date;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import models.VoitureEssence;

public class ParametresVoitureEssenceView extends ParametresVoitureView {
	
	protected VoitureEssence voitureModel;
	
	protected JLabel labelJauge;
	protected int widthJauge;

	public ParametresVoitureEssenceView(VoitureEssence pVoitureModel, ImageIcon pImageJauge, ImageIcon pImageStandAllume, ImageIcon pImageStandEteint) {
		super();
		super.init();
		
		this.voitureModel = pVoitureModel;
		this.labelJauge = new JLabel(pImageJauge);
		
		this.imageStandAllume = pImageStandAllume;
		this.imageStandEteint = pImageStandEteint;
		this.labelStand = new JLabel(imageStandEteint);
		
		JPanel jaugePanel = new JPanel();
		jaugePanel.setLayout(null);
		jaugePanel.setPreferredSize(new Dimension(220, 50));
		jaugePanel.setBounds(0, 0, 220, 50);
		jaugePanel.add(labelJauge);
		
		labelJauge.setPreferredSize(new Dimension(200, 50));
		labelJauge.setBounds(10, 0, 200, 50);
		
		this.northPanel.setLayout(new BorderLayout());
		this.northPanel.add(jaugePanel, BorderLayout.CENTER);
		this.northPanel.add(this.labelStand, BorderLayout.EAST);
		
		this.southPanel.setLayout(new BorderLayout());
		this.southPanel.add(this.txtVitesse, BorderLayout.WEST);
		this.southPanel.add(this.txtNbTours, BorderLayout.CENTER);
		this.southPanel.add(this.txtClassement, BorderLayout.EAST);	
		
		this.widthJauge = 200;
		
		//this.setPreferredSize(new Dimension (300, 50));
		setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.black), "Voiture essence"));
		
		setVisible(true);
	}

	@Override
	public void update() {
			updateVitesse((int) voitureModel.getCVitesse());
			updateStand(voitureModel.hasToFill(), voitureModel.isFilling());
			updateNbTours(voitureModel.getNbTours() + 1, voitureModel.getNbToursTotal());
			updateClassement(voitureModel.getClassement() + 1);
			updateJauge(voitureModel.getNiveauReservoir(), voitureModel.getNiveauReservoirMax());
	}
	
	public void updateJauge(double niveauReservoir, double niveauReservoirMax) {
		this.labelJauge.setBounds(10, 0 ,(int)(niveauReservoir * this.widthJauge / 100), this.labelJauge.getHeight());
	}

}
