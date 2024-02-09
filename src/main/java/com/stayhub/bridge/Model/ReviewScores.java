package com.stayhub.bridge.Model;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ReviewScores {
    private int review_scores_accuracy;
    private int review_scores_cleanliness;
    private int review_scores_checkin;
    private int review_scores_communication;
    private int review_scores_location;
    private int review_scores_value;
    private int review_scores_rating;
}
