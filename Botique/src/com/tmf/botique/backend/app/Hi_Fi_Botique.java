package com.tmf.botique.backend.app;

import com.tmf.botique.backend.services.BotiqueServices;
import com.tmf.botique.backend.services.DressServices;

public class Hi_Fi_Botique {
	public static void main(String[] args) {
		BotiqueServices service = new DressServices();
		service.botiqueServices();
	}
}
