package Example;

public class TestSwitch {
public static void main(String[] args) {
	int day = 9;
	String dayString = null;
	switch (day) {
	case 0:
		dayString = "sunday";
		break;
	case 1:
		dayString = "monday";
		break;
	case 2:
		dayString = "tuseday";
		break;
	case 3:
		dayString = "wendeshday";
		break;
	case 4:
		dayString = "thuseday";
		break;
	case 5:
		dayString = "friday";
		break;
	case 6:
		dayString = "saturday";
		break;
	default:
		dayString = "This day is yet to come,plz wait!!";
	}System.out.println(dayString);
}
}
