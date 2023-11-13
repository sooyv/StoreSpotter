package com.sojoo.StoreSpotter.dto.storePair;

import com.sojoo.StoreSpotter.dto.apiToDb.StoreInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.geolatte.geom.Geometry;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PairData {
    private Integer pair_id;
    private String st_coor;
    private String com_coor;
    private Double dist;
    private Integer region_fk;

}