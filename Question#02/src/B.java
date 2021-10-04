
public class B extends Marks{
	private double banglaMarks;
	private double englishMarks;
	private double mathMarks;
	private double higherMath;
	

	public B() {
		this.banglaMarks = 0;
		this.englishMarks = 0;
		this.mathMarks = 0;
		this.higherMath = 0;
	}


	public B(double banglaMarks, double englishMarks, double mathMarks, double higherMath) {
		this.banglaMarks = banglaMarks;
		this.englishMarks = englishMarks;
		this.mathMarks = mathMarks;
		this.higherMath = higherMath;
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


	public double getHigherMath() {
		return higherMath;
	}


	public void setHigherMath(double higherMath) {
		this.higherMath = higherMath;
	}


	@Override
	public double getPercentage() {
		return (((this.getBanglaMarks()+this.getEnglishMarks()+this.getMathMarks()+this.getHigherMath())/400)*100);
	}
	public void print() {
		System.out.println("Bangla marks : "+this.getBanglaMarks()+"\nEnglish Marks : "+this.getEnglishMarks()+"\nMath marks : "+this.getMathMarks()+"\nHigher Math Marks : "+this.getHigherMath()+"\nTotal Percentage Marks : "+this.getPercentage()+" %");
	}

}
