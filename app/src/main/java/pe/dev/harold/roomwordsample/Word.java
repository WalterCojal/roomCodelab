package pe.dev.harold.roomwordsample;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "words")
public class Word {

    @PrimaryKey(autoGenerate = true)
    @NonNull
    private int id;

    @NonNull
    private String mWord;

    public Word(int id,@NonNull String mWord) {
        this.id = id;
        this.mWord = mWord;
    }

    public String getWord() {
        return mWord;
    }

    public int getId() {
        return id;
    }
}
