package Inheritance;

public class Son extends Father {
    @Override
    public void showGrandfatherHeight() {
        String height = "Tall";
        System.out.println(height);
    }
    @Override
    public void showGrandfatherBoldness() {
        String boldness = "Not Bold";
        System.out.println(boldness);
    }
    @Override
    public void showGrandfatherBehavior() {
        String behavior = "Angry";
        System.out.println(behavior);
    }
    @Override
    public void showFatherEducation() {
        String education = "MA";
        System.out.println(education);
    }
    @Override
    public void showFatherStudyTime() {
        String studyTime = "Very Much";
        System.out.println(studyTime);
    }
}
