package com.github.hcsp.inheritance;

public class Story {
    public final void tellStory() {
        startStory();
        story();
        endStory();
    }

    private void startStory() {
        System.out.println("开始讲故事啦");
    }

      void story() {
        System.out.println("从前有个老和尚");
    }

    protected void endStory() {
        System.out.println("故事讲完啦");
    }

    public static void main(String[] args) {
        new Story().tellStory();
    }
}
