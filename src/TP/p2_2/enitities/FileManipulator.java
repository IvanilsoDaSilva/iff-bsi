package TP.p2_2.enitities;

public class FileManipulator {
	private String inputPath, exportPath, divisor, cabecalho[];
	
	public FileManipulator(String inputPath, String exportPath, String divisor, String[] cabecalho) {
		this.inputPath = inputPath;
		this.exportPath = exportPath;
		this.divisor = divisor;
		this.cabecalho = cabecalho;
	}
}
