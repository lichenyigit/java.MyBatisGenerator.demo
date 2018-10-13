package myBatisGenerator.demo.dao;

import java.util.List;
import myBatisGenerator.demo.domain.FavoriteList;
import myBatisGenerator.demo.domain.FavoriteListExample;
import org.apache.ibatis.annotations.Param;

public interface FavoriteListMapper {
    long countByExample(FavoriteListExample example);

    int deleteByExample(FavoriteListExample example);

    int insert(FavoriteList record);

    int insertSelective(FavoriteList record);

    List<FavoriteList> selectByExampleWithBLOBs(FavoriteListExample example);

    List<FavoriteList> selectByExample(FavoriteListExample example);

    int updateByExampleSelective(@Param("record") FavoriteList record, @Param("example") FavoriteListExample example);

    int updateByExampleWithBLOBs(@Param("record") FavoriteList record, @Param("example") FavoriteListExample example);

    int updateByExample(@Param("record") FavoriteList record, @Param("example") FavoriteListExample example);
}