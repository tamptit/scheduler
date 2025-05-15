package com.example.scheduler.repository.resident;

import com.example.scheduler.domain.resident.SourceCitizen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.stream.Stream;

//@Mapper
@Repository
//@PersistenceContext(name = "secondaryEntityManagerFactory")
public interface SourceRepository {

    @Query("SELECT r FROM SourceCitizen r WHERE r.identity = :identity")
    SourceCitizen findByIdentity(@Param("identity") String identity);


    @Query("SELECT r FROM SourceCitizen r")
    Stream<SourceCitizen> streamAll();

//    @SelectKey(statement = "SELECT LAST_INSERT_ID()", before = true, keyColumn = "ID", keyProperty = "id", resultType = String.class )
//    @Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
//    @Insert("INSERT INTO resident_citizen( PERSONAL_ID, IDENTITY,NAME,GENDER,BLOOD,BIRTH_DATE,NATIONALITY) " +
//            " VALUES ( #{personalId}, #{identity}, #{name}, #{gender}, #{blood},#{birthDate},#{nationality})")
//    public boolean insert(SourceCitizen citizenDto);

//    @Insert({
//            "<script>",
//            "insert into resident_citizen (ID, PERSONAL_ID, IDENTITY,NAME,GENDER,BLOOD,BIRTH_DATE,NATIONALITY)",
//            "values",
//            "<foreach  collection='citizenDtos' item='c' separator=','>",
//            "(#{c.id},#{c.personalId}, #{c.identity}, #{c.name}, #{c.gender}, " +
//                    "#{c.blood},#{c.birthDate},#{c.nationality})",
//            "</foreach>",
//            "</script>"
//    })
//    public boolean insertBatch(@Param("citizenDtos") List<SourceCitizen> citizenDtos);
}
