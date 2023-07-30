import javax.swing.ImageIcon;

//Samiksha Satthy
//Creates Lesson Object 

public class Lesson {

	// fields
	private String conceptTitle;
	private String lessonOne;
	private String lessonOnePoint1;
	private String lessonOnePoint2;
	private String lessonOnePoint3;
	private String lessonTwo;
	private String lessonTwoPoint1;
	private String lessonTwoPoint2;
	private String lessonTwoPoint3;
	private String lessonThree;
	private String lessonThreePoint1;
	private String lessonThreePoint2;
	private String lessonThreePoint3;
	private String lessonFour;
	private String lessonFourPoint1;
	private String lessonFourPoint2;
	private String lessonFourPoint3;
	private int conceptTitleX;
	private int conceptTitleY;
	private int conceptTitleSize;
	private String lessonOneImage;
	private String lessonTwoImage;
	private String lessonThreeImage;
	private String lessonFourImage;
	private int lessonPoint1TitleX;
	private int lessonPoint1PointsY;
	private int lessonPoint1ImageX;
	private int lessonPoint1ImageY;
	private int lessonPoint2TitleX;
	private int lessonPoint2PointsY;
	private int lessonPoint2ImageX;
	private int lessonPoint2ImageY;
	private int lessonPoint3TitleX;
	private int lessonPoint3PointsY;
	private int lessonPoint3ImageX;
	private int lessonPoint3ImageY;
	private int lessonPoint4TitleX;
	private int lessonPoint4PointsY;
	private int lessonPoint4ImageX;
	private int lessonPoint4ImageY;

	// constructor
	public Lesson(String conceptTitle, String lessonOne, String lessonOnePoint1, String lessonOnePoint2,
			String lessonOnePoint3, String lessonTwo, String lessonTwoPoint1, String lessonTwoPoint2,
			String lessonTwoPoint3, String lessonThree, String lessonThreePoint1, String lessonThreePoint2,
			String lessonThreePoint3, String lessonFour, String lessonFourPoint1, String lessonFourPoint2,
			String lessonFourPoint3, int conceptTitleX, int conceptTitleY, int conceptTitleSize, String lessonOneImage,
			String lessonTwoImage, String lessonThreeImage, String lessonFourImage, int lessonPoint1TitleX,
			int lessonPoint1PointsY, int lessonPoint1ImageX, int lessonPoint1ImageY, int lessonPoint2TitleX,
			int lessonPoint2PointsY, int lessonPoint2ImageX, int lessonPoint2ImageY, int lessonPoint3TitleX,
			int lessonPoint3PointsY, int lessonPoint3ImageX, int lessonPoint3ImageY, int lessonPoint4TitleX,
			int lessonPoint4PointsY, int lessonPoint4ImageX, int lessonPoint4ImageY) {
		super();
		this.conceptTitle = conceptTitle;
		this.lessonOne = lessonOne;
		this.lessonOnePoint1 = lessonOnePoint1;
		this.lessonOnePoint2 = lessonOnePoint2;
		this.lessonOnePoint3 = lessonOnePoint3;
		this.lessonTwo = lessonTwo;
		this.lessonTwoPoint1 = lessonTwoPoint1;
		this.lessonTwoPoint2 = lessonTwoPoint2;
		this.lessonTwoPoint3 = lessonTwoPoint3;
		this.lessonThree = lessonThree;
		this.lessonThreePoint1 = lessonThreePoint1;
		this.lessonThreePoint2 = lessonThreePoint2;
		this.lessonThreePoint3 = lessonThreePoint3;
		this.lessonFour = lessonFour;
		this.lessonFourPoint1 = lessonFourPoint1;
		this.lessonFourPoint2 = lessonFourPoint2;
		this.lessonFourPoint3 = lessonFourPoint3;
		this.conceptTitleX = conceptTitleX;
		this.conceptTitleY = conceptTitleY;
		this.conceptTitleSize = conceptTitleSize;
		this.lessonOneImage = lessonOneImage;
		this.lessonTwoImage = lessonTwoImage;
		this.lessonThreeImage = lessonThreeImage;
		this.lessonFourImage = lessonFourImage;
		this.lessonPoint1TitleX = lessonPoint1TitleX;
		this.lessonPoint1PointsY = lessonPoint1PointsY;
		this.lessonPoint1ImageX = lessonPoint1ImageX;
		this.lessonPoint1ImageY = lessonPoint1ImageY;
		this.lessonPoint2TitleX = lessonPoint2TitleX;
		this.lessonPoint2PointsY = lessonPoint2PointsY;
		this.lessonPoint2ImageX = lessonPoint2ImageX;
		this.lessonPoint2ImageY = lessonPoint2ImageY;
		this.lessonPoint3TitleX = lessonPoint3TitleX;
		this.lessonPoint3PointsY = lessonPoint3PointsY;
		this.lessonPoint3ImageX = lessonPoint3ImageX;
		this.lessonPoint3ImageY = lessonPoint3ImageY;
		this.lessonPoint4TitleX = lessonPoint4TitleX;
		this.lessonPoint4PointsY = lessonPoint4PointsY;
		this.lessonPoint4ImageX = lessonPoint4ImageX;
		this.lessonPoint4ImageY = lessonPoint4ImageY;
	}

	// getters and setters
	public String getConceptTitle() {
		return conceptTitle;
	}

	public void setConceptTitle(String conceptTitle) {
		this.conceptTitle = conceptTitle;
	}

	public String getLessonOne() {
		return lessonOne;
	}

	public void setLessonOne(String lessonOne) {
		this.lessonOne = lessonOne;
	}

	public String getLessonOnePoint1() {
		return lessonOnePoint1;
	}

	public void setLessonOnePoint1(String lessonOnePoint1) {
		this.lessonOnePoint1 = lessonOnePoint1;
	}

	public String getLessonOnePoint2() {
		return lessonOnePoint2;
	}

	public void setLessonOnePoint2(String lessonOnePoint2) {
		this.lessonOnePoint2 = lessonOnePoint2;
	}

	public String getLessonOnePoint3() {
		return lessonOnePoint3;
	}

	public void setLessonOnePoint3(String lessonOnePoint3) {
		this.lessonOnePoint3 = lessonOnePoint3;
	}

	public String getLessonTwo() {
		return lessonTwo;
	}

	public void setLessonTwo(String lessonTwo) {
		this.lessonTwo = lessonTwo;
	}

	public String getLessonTwoPoint1() {
		return lessonTwoPoint1;
	}

	public void setLessonTwoPoint1(String lessonTwoPoint1) {
		this.lessonTwoPoint1 = lessonTwoPoint1;
	}

	public String getLessonTwoPoint2() {
		return lessonTwoPoint2;
	}

	public void setLessonTwoPoint2(String lessonTwoPoint2) {
		this.lessonTwoPoint2 = lessonTwoPoint2;
	}

	public String getLessonTwoPoint3() {
		return lessonTwoPoint3;
	}

	public void setLessonTwoPoint3(String lessonTwoPoint3) {
		this.lessonTwoPoint3 = lessonTwoPoint3;
	}

	public String getLessonThree() {
		return lessonThree;
	}

	public void setLessonThree(String lessonThree) {
		this.lessonThree = lessonThree;
	}

	public String getLessonThreePoint1() {
		return lessonThreePoint1;
	}

	public void setLessonThreePoint1(String lessonThreePoint1) {
		this.lessonThreePoint1 = lessonThreePoint1;
	}

	public String getLessonThreePoint2() {
		return lessonThreePoint2;
	}

	public void setLessonThreePoint2(String lessonThreePoint2) {
		this.lessonThreePoint2 = lessonThreePoint2;
	}

	public String getLessonThreePoint3() {
		return lessonThreePoint3;
	}

	public void setLessonThreePoint3(String lessonThreePoint3) {
		this.lessonThreePoint3 = lessonThreePoint3;
	}

	public String getLessonFour() {
		return lessonFour;
	}

	public void setLessonFour(String lessonFour) {
		this.lessonFour = lessonFour;
	}

	public String getLessonFourPoint1() {
		return lessonFourPoint1;
	}

	public void setLessonFourPoint1(String lessonFourPoint1) {
		this.lessonFourPoint1 = lessonFourPoint1;
	}

	public String getLessonFourPoint2() {
		return lessonFourPoint2;
	}

	public void setLessonFourPoint2(String lessonFourPoint2) {
		this.lessonFourPoint2 = lessonFourPoint2;
	}

	public String getLessonFourPoint3() {
		return lessonFourPoint3;
	}

	public void setLessonFourPoint3(String lessonFourPoint3) {
		this.lessonFourPoint3 = lessonFourPoint3;
	}

	public int getConceptTitleX() {
		return conceptTitleX;
	}

	public void setConceptTitleX(int conceptTitleX) {
		this.conceptTitleX = conceptTitleX;
	}

	public int getConceptTitleY() {
		return conceptTitleY;
	}

	public void setConceptTitleY(int conceptTitleY) {
		this.conceptTitleY = conceptTitleY;
	}

	public int getConceptTitleSize() {
		return conceptTitleSize;
	}

	public void setConceptTitleSize(int conceptTitleSize) {
		this.conceptTitleSize = conceptTitleSize;
	}

	public String getLessonOneImage() {
		return lessonOneImage;
	}

	public void setLessonOneImage(String lessonOneImage) {
		this.lessonOneImage = lessonOneImage;
	}

	public String getLessonTwoImage() {
		return lessonTwoImage;
	}

	public void setLessonTwoImage(String lessonTwoImage) {
		this.lessonTwoImage = lessonTwoImage;
	}

	public String getLessonThreeImage() {
		return lessonThreeImage;
	}

	public void setLessonThreeImage(String lessonThreeImage) {
		this.lessonThreeImage = lessonThreeImage;
	}

	public String getLessonFourImage() {
		return lessonFourImage;
	}

	public void setLessonFourImage(String lessonFourImage) {
		this.lessonFourImage = lessonFourImage;
	}

	public int getLessonPoint1TitleX() {
		return lessonPoint1TitleX;
	}

	public void setLessonPoint1TitleX(int lessonPoint1TitleX) {
		this.lessonPoint1TitleX = lessonPoint1TitleX;
	}

	public int getLessonPoint1PointsY() {
		return lessonPoint1PointsY;
	}

	public void setLessonPoint1PointsY(int lessonPoint1PointsY) {
		this.lessonPoint1PointsY = lessonPoint1PointsY;
	}

	public int getLessonPoint1ImageX() {
		return lessonPoint1ImageX;
	}

	public void setLessonPoint1ImageX(int lessonPoint1ImageX) {
		this.lessonPoint1ImageX = lessonPoint1ImageX;
	}

	public int getLessonPoint1ImageY() {
		return lessonPoint1ImageY;
	}

	public void setLessonPoint1ImageY(int lessonPoint1ImageY) {
		this.lessonPoint1ImageY = lessonPoint1ImageY;
	}

	public int getLessonPoint2TitleX() {
		return lessonPoint2TitleX;
	}

	public void setLessonPoint2TitleX(int lessonPoint2TitleX) {
		this.lessonPoint2TitleX = lessonPoint2TitleX;
	}

	public int getLessonPoint2PointsY() {
		return lessonPoint2PointsY;
	}

	public void setLessonPoint2PointsY(int lessonPoint2PointsY) {
		this.lessonPoint2PointsY = lessonPoint2PointsY;
	}

	public int getLessonPoint2ImageX() {
		return lessonPoint2ImageX;
	}

	public void setLessonPoint2ImageX(int lessonPoint2ImageX) {
		this.lessonPoint2ImageX = lessonPoint2ImageX;
	}

	public int getLessonPoint2ImageY() {
		return lessonPoint2ImageY;
	}

	public void setLessonPoint2ImageY(int lessonPoint2ImageY) {
		this.lessonPoint2ImageY = lessonPoint2ImageY;
	}

	public int getLessonPoint3TitleX() {
		return lessonPoint3TitleX;
	}

	public void setLessonPoint3TitleX(int lessonPoint3TitleX) {
		this.lessonPoint3TitleX = lessonPoint3TitleX;
	}

	public int getLessonPoint3PointsY() {
		return lessonPoint3PointsY;
	}

	public void setLessonPoint3PointsY(int lessonPoint3PointsY) {
		this.lessonPoint3PointsY = lessonPoint3PointsY;
	}

	public int getLessonPoint3ImageX() {
		return lessonPoint3ImageX;
	}

	public void setLessonPoint3ImageX(int lessonPoint3ImageX) {
		this.lessonPoint3ImageX = lessonPoint3ImageX;
	}

	public int getLessonPoint3ImageY() {
		return lessonPoint3ImageY;
	}

	public void setLessonPoint3ImageY(int lessonPoint3ImageY) {
		this.lessonPoint3ImageY = lessonPoint3ImageY;
	}

	public int getLessonPoint4TitleX() {
		return lessonPoint4TitleX;
	}

	public void setLessonPoint4TitleX(int lessonPoint4TitleX) {
		this.lessonPoint4TitleX = lessonPoint4TitleX;
	}

	public int getLessonPoint4PointsY() {
		return lessonPoint4PointsY;
	}

	public void setLessonPoint4PointsY(int lessonPoint4PointsY) {
		this.lessonPoint4PointsY = lessonPoint4PointsY;
	}

	public int getLessonPoint4ImageX() {
		return lessonPoint4ImageX;
	}

	public void setLessonPoint4ImageX(int lessonPoint4ImageX) {
		this.lessonPoint4ImageX = lessonPoint4ImageX;
	}

	public int getLessonPoint4ImageY() {
		return lessonPoint4ImageY;
	}

	public void setLessonPoint4ImageY(int lessonPoint4ImageY) {
		this.lessonPoint4ImageY = lessonPoint4ImageY;
	}

	// toString
	@Override
	public String toString() {
		return "Lesson [conceptTitle=" + conceptTitle + ", lessonOne=" + lessonOne + ", lessonOnePoint1="
				+ lessonOnePoint1 + ", lessonOnePoint2=" + lessonOnePoint2 + ", lessonOnePoint3=" + lessonOnePoint3
				+ ", lessonTwo=" + lessonTwo + ", lessonTwoPoint1=" + lessonTwoPoint1 + ", lessonTwoPoint2="
				+ lessonTwoPoint2 + ", lessonTwoPoint3=" + lessonTwoPoint3 + ", lessonThree=" + lessonThree
				+ ", lessonThreePoint1=" + lessonThreePoint1 + ", lessonThreePoint2=" + lessonThreePoint2
				+ ", lessonThreePoint3=" + lessonThreePoint3 + ", lessonFour=" + lessonFour + ", lessonFourPoint1="
				+ lessonFourPoint1 + ", lessonFourPoint2=" + lessonFourPoint2 + ", lessonFourPoint3=" + lessonFourPoint3
				+ ", conceptTitleX=" + conceptTitleX + ", conceptTitleY=" + conceptTitleY + ", conceptTitleSize="
				+ conceptTitleSize + ", lessonOneImage=" + lessonOneImage + ", lessonTwoImage=" + lessonTwoImage
				+ ", lessonThreeImage=" + lessonThreeImage + ", lessonFourImage=" + lessonFourImage
				+ ", lessonPoint1TitleX=" + lessonPoint1TitleX + ", lessonPoint1PointsY=" + lessonPoint1PointsY
				+ ", lessonPoint1ImageX=" + lessonPoint1ImageX + ", lessonPoint1ImageY=" + lessonPoint1ImageY
				+ ", lessonPoint2TitleX=" + lessonPoint2TitleX + ", lessonPoint2PointsY=" + lessonPoint2PointsY
				+ ", lessonPoint2ImageX=" + lessonPoint2ImageX + ", lessonPoint2ImageY=" + lessonPoint2ImageY
				+ ", lessonPoint3TitleX=" + lessonPoint3TitleX + ", lessonPoint3PointsY=" + lessonPoint3PointsY
				+ ", lessonPoint3ImageX=" + lessonPoint3ImageX + ", lessonPoint3ImageY=" + lessonPoint3ImageY
				+ ", lessonPoint4TitleX=" + lessonPoint4TitleX + ", lessonPoint4PointsY=" + lessonPoint4PointsY
				+ ", lessonPoint4ImageX=" + lessonPoint4ImageX + ", lessonPoint4ImageY=" + lessonPoint4ImageY + "]";
	}

}
