package com.example.data.mapper;

import com.example.data.domain.source.SourceCitizen;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class NatCitizenRowMapper implements RowMapper<SourceCitizen> {
    public static final String ID_COLUMN = "ID";
    public static final String NAME_COLUMN = "NAME";

    public SourceCitizen mapRow(ResultSet rs, int rowNum) throws SQLException {
        SourceCitizen citizenDestination = new SourceCitizen();
        citizenDestination.setId(rs.getString(ID_COLUMN));
        citizenDestination.setPersonalId(rs.getString(rs.getString("PERSONAL_ID")));
        citizenDestination.setIdentity(rs.getString("IDENTITY"));
        citizenDestination.setName(rs.getString(NAME_COLUMN));
        citizenDestination.setGender(rs.getString("GENDER"));
        citizenDestination.setBlood(rs.getString("BLOOD"));
        citizenDestination.setBirthDate(rs.getString("BIRTH_DATE"));
        citizenDestination.setNationality(rs.getString("NATIONALITY"));
        return citizenDestination;
    }
}

