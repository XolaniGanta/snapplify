package com.snapplify.microservice.pojo.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateSensitiveWordsRequest {
    private List<UpdateSensitiveWords> updateSensitiveWords;
}
