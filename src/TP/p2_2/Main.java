package TP.p2_2;

import java.io.*;

import TP.p2_2.enitities.*;

public class Main {
	public static void main(String[] args) {		
//		CSVObject csv = new CSVObject(
//			new File(System.getProperty("user.dir")+"/src/TP/p2/entrada-de-arquivo/dataset2-entrada.csv"),
//			";"
//		);
//		csv.exportTo(new File(""));
		
		// ou
		
		CSVObject csv = new CSVObject();
		csv.importFrom(new File(""), ";", new String[] {});
		csv.exportTo(new File(""));
	}

}
