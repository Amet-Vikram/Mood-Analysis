

public class MoodAnalyser {
    public String analyseMood(String message) {
        if(message.contains("sad")){
            return "Sad";
        }
        return "Happy";
    }

    public static void main(String[] args) {
        MoodAnalyser moodAnalyser = new MoodAnalyser();

        System.out.println("Mood: " + moodAnalyser.analyseMood("I am sad today"));
        System.out.println("Mood: " + moodAnalyser.analyseMood("I am happy today"));
    }
}