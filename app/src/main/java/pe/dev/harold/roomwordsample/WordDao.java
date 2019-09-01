package pe.dev.harold.roomwordsample;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface WordDao {

    @Insert
    void insert(Word word);

    @Delete
    void delete(Word word);

    @Query("delete from words")
    void deleteAll();

    @Query("select * from words order by id asc")
    LiveData<List<Word>> getAllWords();

}
