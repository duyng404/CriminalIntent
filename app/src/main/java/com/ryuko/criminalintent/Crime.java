package com.ryuko.criminalintent;

import java.util.UUID;

public class Crime {
    private UUID mId;
    private String mTitle;

    public UUID getmId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        this.mTitle = title;
    }

    public Crime(){
        // Generate unique identifier
        mId = UUID.randomUUID();
    }
}
