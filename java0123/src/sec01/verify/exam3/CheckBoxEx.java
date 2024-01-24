package sec01.verify.exam3;

public class CheckBoxEx {
	public static void main(String[]args) {
		CheckBox checkBox = new CheckBox();
		checkBox.setOnSelectListener(new BackgroundChangeListener());
		checkBox.select();
	}
}
