package com.itsmeolivia.interactivestory.model;

/**
 * Created by olivia on 7/15/15.
 */
public class Page {

    private int mImageId;
    private String mText;

    private Choice mChoice1;
    private Choice mChoice2;

    private boolean mIsFinal = false;

    public Page(int id, String text, Choice one, Choice two){

        mImageId = id;
        mText = text;
        mChoice1 = one;

    }

    public Page(int id, String text) {
        mImageId = id;
        mText = text;
        mChoice1 = null;
        mChoice2 = null;
        mIsFinal = true;


    }

    public boolean isFinal() {
        return mIsFinal;
    }

    public void setIsFinal(boolean isFinal) {
        mIsFinal = isFinal;
    }


    public int getImageId() {
        return mImageId;
    }

    public void setImageId(int imageId) {
        mImageId = imageId;
    }

    public String getText() {
        return mText;
    }

    public void setText(String text) {
        mText = text;
    }

    public Choice getChoice1() {
        return mChoice1;
    }

    public void setChoice1(Choice choice1) {
        mChoice1 = choice1;
    }

    public Choice getChoice2() {
        return mChoice2;
    }

    public void setChoice2(Choice choice2) {
        mChoice2 = choice2;
    }
}
