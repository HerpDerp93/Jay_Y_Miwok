package com.example.android.miwok;

/**
 * Created by Jay Y. on 9/12/2016.
 */
public class Word {

    /** Miwok translation for the word */
    private String mMiwokTranslation;

    /**Default translation for the word */
    private String mDefaultTranslation;

    /**
     * {@link Word} represents a vocabulary word that the user wants to learn.
     * It contains a default translation and a Miwok translation for that word.
     * @param defaultTranslation translation in the users' default language
     * @param miwokTranslation translation in Miwok language
     */
    public Word(String defaultTranslation, String miwokTranslation){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    /**
     * Get the default translation of the word.
     * @return a String of the default translation
     */
    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }

    /**
     * Get the miwok translation of the word.
     * @return a String of the Miwok translation.
     */
    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }
}