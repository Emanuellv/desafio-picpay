package  com.picpay.desafio.android.data.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.picpay.framework.db.UserEntity

@Dao
interface UserDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addUserEntity(userEntity: UserEntity)

    // here I can use LIMIT = X(value) and create a pagination
    @Query("SELECT * FROM users")
    suspend fun getAllUserEntity():List<UserEntity>
}