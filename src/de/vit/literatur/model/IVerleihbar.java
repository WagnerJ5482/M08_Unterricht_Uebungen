package de.vit.literatur.model;

import java.util.Date;

public interface IVerleihbar extends IEinsehbar {

	public void verleihen(Date bis);
	public Date getVerliehenBis(); 
}
