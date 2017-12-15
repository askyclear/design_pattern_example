package com.hudini.concreatedecorator;

import com.hudini.component.GunComponent;
import com.hudini.decorator.GunDecorator;

public class Laser extends GunDecorator{
	public Laser(GunComponent gunComponent){
		super(gunComponent);
	}
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return super.gunComponent.getDescription() + " Laser";
	}

	@Override
	public int cost() {
		// TODO Auto-generated method stub
		return super.gunComponent.cost() + 500;
	}

	@Override
	public void Attack() {
		// TODO Auto-generated method stub
		super.gunComponent.Attack();
		System.out.println("Laser");
	}
 
}
