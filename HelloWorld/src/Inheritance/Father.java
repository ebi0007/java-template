package Inheritance;

public class Father extends Grandfather {
    @Override
    public void showGrandfatherBehavior() {
        String behavior = "Well=behaved";
        System.out.println(behavior);
    }
    @Override
    public void showGrandfatherCreativity() {
        String creativity = "Creative";
        System.out.println(creativity);
    }

///////////////////// ezafe shudan vizhegi haye jadid
    public void showFatherEducation() {
        String education = "BA";
        System.out.println(education);
    }
    public void showFatherStudyTime() {
        String studyTime = "Much";
        System.out.println(studyTime);
    }

}
