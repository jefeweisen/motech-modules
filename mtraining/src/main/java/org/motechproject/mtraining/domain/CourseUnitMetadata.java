package org.motechproject.mtraining.domain;

import org.motechproject.mds.annotations.Entity;
import org.motechproject.mds.annotations.Field;
import org.motechproject.mds.domain.MdsEntity;

import javax.jdo.annotations.Persistent;

/**
 * Common metadata shared by all course sub classes
 */
@Entity
public class CourseUnitMetadata extends MdsEntity {

    /**
     * Name of the course unit
     */
    @Field
    @Persistent(defaultFetchGroup = "true")
    private String name;

    /**
     * Status of the course unit
     */
    @Field
    @Persistent(defaultFetchGroup = "true")
    private CourseUnitState state;

    /**
     * The content for the course unit. This could be url or string representation for
     * where to find the content in the external system. For example, this could be a
     * resource pointer for an audio file in an IVR system.
     */
    @Field
    @Persistent(defaultFetchGroup = "true")
    private String content;

    /**
     * Constructor with all arguments
     * @param name Name of the unit
     * @param state Status of the unit
     * @param content Content reference for the unit
     */
    public CourseUnitMetadata(String name, CourseUnitState state, String content) {
        this.name = name;
        this.state = state;
        this.content = content;
    }

    public String getContent() {

        return content;
    }

    public void setContent(String content) {

        this.content = content;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public CourseUnitState getState() {

        return state;
    }

    public void setState(CourseUnitState state) {

        this.state = state;
    }
}
