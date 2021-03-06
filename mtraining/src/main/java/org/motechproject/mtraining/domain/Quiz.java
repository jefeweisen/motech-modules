package org.motechproject.mtraining.domain;

import org.motechproject.mds.annotations.Entity;
import org.motechproject.mds.annotations.Field;

import java.util.List;

/**
 * Quiz object to store questions and answer for a chapter
 */
@Entity
public class Quiz extends CourseUnitMetadata {

    /**
     * List of questions for the quiz
     */
    @Field
    private List<Question> questions;

    /**
     * Pass percentage for the quiz
     */
    @Field
    private double passPercentage;

    public Quiz(String name, CourseUnitState state, String content) {
        super(name, state, content);
    }

    public Quiz(String name, CourseUnitState state, String content, List<Question> questions, double passPercentage) {
        super(name, state, content);
        this.questions = questions;
        this.passPercentage = passPercentage;
    }

    public List<Question> getQuestions() {

        return questions;
    }

    public void setQuestions(List<Question> questions) {

        this.questions = questions;
    }

    public double getPassPercentage() {

        return passPercentage;
    }

    public void setPassPercentage(double passPercentage) {

        this.passPercentage = passPercentage;
    }
}
