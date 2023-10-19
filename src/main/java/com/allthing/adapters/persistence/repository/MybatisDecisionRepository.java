package com.allthing.adapters.persistence.repository;

import com.allthing.adapters.persistence.entity.MybatisDecisionEntity;
import com.allthing.adapters.util.UuidTypeHandler;
import com.allthing.application.domain.Decision;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Update;

import java.time.LocalDate;
import java.util.UUID;


public interface MybatisDecisionRepository {
    
    @Insert({
            "INSERT INTO decision (id, number, category, details, responsible_party, proposal_date, proposed_by, status, approved_by, approval_date, comments) ",
            "VALUES (#{id},  #{number},  #{category},  #{details},  #{responsibleParty},  #{proposalDate},  #{proposedBy},  #{status},  #{approvedBy},  #{approvalDate},  #{comments})"
    })
    @Results(id = "decisionResultMap", value = {
            @Result(property = "id", column = "id", javaType = UUID.class, typeHandler = UuidTypeHandler.class),
            @Result(property = "number", column = "number", javaType = Long.class),
            @Result(property = "category", column = "category", javaType = String.class),
            @Result(property = "details", column = "details", javaType = String.class),
            @Result(property = "responsibleParty", column = "responsible_party", javaType = String.class),
            @Result(property = "proposalDate", column = "proposal_date", javaType = LocalDate.class),
            @Result(property = "proposedBy", column = "proposed_by", javaType = String.class),
            @Result(property = "status", column = "status", javaType = String.class),
            @Result(property = "approvedBy", column = "approved_by", javaType = String.class),
            @Result(property = "approvalDate", column = "approval_date", javaType = LocalDate.class),
            @Result(property = "comments", column = "comments", javaType = String.class)
    })
    MybatisDecisionEntity create(MybatisDecisionEntity decision);
    
    @Delete({
            "DELETE FROM decision " +
                    "WHERE id = #{id}"
    })
    @ResultMap(value = "decisionResultMap")
    Long deleteById(UUID id);
    
    @Update({
            "UPDATE decision SET number = #{number}, category = #{category}, details = #{details}, responsible_party = #{responsibleParty}, " +
                    "proposal_date = #{proposalDate}, proposed_by = #{proposedBy}, status = #{status}, approved_by = #{approvedBy}, " +
                    "approval_date = #{approvalDate}, comments = #{comments} " +
                    "WHERE id = #{id}" })
    @ResultMap(value = "decisionResultMap")
    MybatisDecisionEntity update(MybatisDecisionEntity decision);
}
