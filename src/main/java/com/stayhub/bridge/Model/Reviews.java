package com.stayhub.bridge.Model;

import java.util.Date;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@NoArgsConstructor
public class Reviews {
    private String _id;
    private Date date;
    private String reviewer_id;
    private String reviewer_name;
    private String comments;
}
