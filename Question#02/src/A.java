
public class A extends Marks{
	private double banglaMarks;
	private double englishMarks;
	private double mathMarks;
	
	public A() {
		this.banglaMarks = 0;
		this.englishMarks = 0;
		this.mathMarks = 0;
	}

	public A(double banglaMarks, double englishMarks, double mathMarks) {		
		this.banglaMarks = banglaMarks;
		this.englishMarks = englishMarks;
		this.mathMarks = mathMarks;
	}
	

	public double getBanglaMarks() {
		return banglaMarks;
	}

	public void setBanglaMarks(double banglaMarks) {
		this.banglaMarks = banglaMarks;
	}

	public double getEnglishMarks() {
		return englishMarks;
	}

	public void setEnglishMarks(double englishMarks) {
		this.englishMarks = englishMarks;
	}

	public double getMathMarks() {
		return mathMarks;
	}

	public void setMathMarks(double mathMarks) {
		this.mathMarks = mathMarks;
	}
	

	@Override
	public double getPercentage() {
		return (((this.getBanglaMarks()+this.getEnglishMarks()+this.getMathMarks())/300)*100);
	}
	
	public void print() {
		System.out.println("Bangla marks : "+this.getBanglaMarks()+"\nEnglish Marks : "+this.getEnglishMarks()+"\nMath marks : "+this.getMathMarks()+"\nTotal Percentage Marks : "+this.getPercentage()+" %");
	}

}
