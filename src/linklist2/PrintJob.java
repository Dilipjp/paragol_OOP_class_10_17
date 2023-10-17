package linklist2;

public class PrintJob {
private String document;
	
	public PrintJob(String doc) {
		document = doc;
	}

	public String getDocument() {
		return document;
	}

	public void setDocument(String doc) {
		document = doc;
	}

	@Override
	public String toString() {
		return "PrintJob [document=" + document + "]";
	}
	
}
