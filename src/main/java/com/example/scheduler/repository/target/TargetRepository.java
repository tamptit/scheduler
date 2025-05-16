package com.example.scheduler.repository.target;

import com.example.scheduler.domain.target.TargetCitizen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
//@PersistenceContext(name = "primaryEntityManagerFactory")
public interface TargetRepository extends JpaRepository<TargetCitizen, String> {//extends CommonInsertMapper<NatCitizenSync>

//    @SelectKey(statement = "SELECT LAST_INSERT_ID()", before = true, keyColumn = "ID", keyProperty = "id", resultType = String.class )
//    @Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
//    @Insert("INSERT INTO nat_citizen( PERSONAL_ID, IDENTITY,NAME,GENDER,BLOOD,BIRTH_DATE,NATIONALITY) " +
//            " VALUES ( #{personalId}, #{identity}, #{name}, #{gender}, #{blood},#{birthDate},#{nationality})")
//    public boolean insert(NatCitizenSync citizenPo);

//    @InsertProvider(type= SqlProviderAdapter.class, method="insertMultiple")
//    int insertMultiple(MultiRowInsertStatementProvider<NatCitizenSync> insertStatement);

//    default int insertMultiple(NatCitizenSync...records) {
//        return insertMultiple(Arrays.asList(records));
//    }

//    default int insertMultiple(Collection<NatCitizenSync> records) {
//        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, SqlTable.of("nat_citizen"), c ->
//                c.map("ID").toProperty("id")
//                .map("PERSONAL_ID").toProperty("personalId")
//                .map("IDENTITY").toProperty("identity")
//                .map("NAME").toProperty("name")
//                .map("GENDER").toProperty("gender")
//                .map("BLOOD").toProperty("blood")
//                .map("BIRTH_DATE").toProperty("birthDate")
//                .map("NATIONALITY").toProperty("nationality")
//        );
//    }
//    @Insert({
//            "<script>",
//            "insert into nat_citizen (ID, PERSONAL_ID, IDENTITY,NAME,GENDER,BLOOD,BIRTH_DATE,NATIONALITY)",
//            "values",
//            "<foreach  collection='citizenSyncs' item='c' separator=','>",
//            "(#{c.id},#{c.personalId}, #{c.identity}, #{c.name}, #{c.gender}, " +
//                    "#{c.blood},#{c.birthDate},#{c.nationality})",
//            "</foreach>",
//            "</script>"
//    })
//    public boolean insertBatch(@Param("citizenSyncs") List<? extends NatCitizenSync> citizenSyncs);
}
