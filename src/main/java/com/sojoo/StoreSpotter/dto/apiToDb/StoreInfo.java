package com.sojoo.StoreSpotter.dto.apiToDb;

import lombok.*;
import org.springframework.data.geo.Point;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class StoreInfo {
    private String bizesId;
    private String bizesNm;
    private String rdnmAdr;
    private Point coordinates;

    // 위도(lat)와 경도(lon) 값을 받아서 coordinates 필드에 Point 객체로 저장
    public void setCoordinates(Float lon, Float lat) {
        this.coordinates = new Point(lon, lat); // 경도(lon), 위도(lat)
    }
}