package ca.ualberta.cs.feelsbook.feelsbook;

public abstract class Emotion {
    /**
     * This class was created as sort of a model for emotions to inherit from. An instance of this
     * class will never exist, only subclasses will ever be created.
     * This is not an interface because we do want the sub-classes to inherit some of the method
     * that will be the same in every one of the sub-classes of this class.
     */
    // Date can be private since no methods outside of this class should mess with it.
    private String date;
    // Emotion can be private because no methods outside of this class should mess with it.
    private String emotion;
    // Comment, will not be accessed out of the class unless by setters or getters.
    private String comment;

    /**
     * Constructor for this class, this class does not take any arguments, if this constructor
     * is called, an Emotion with the current date and time will be created.
     */
    protected Emotion(){
        // Calling another constructor with a newly generated date
        this(ISO8601.now());
    }

    /**
     * Another Constructor for this class. Assigns the date passed in to member variable called
     * date.
     */
    protected Emotion(String date){
        this.date = date;
    }

    /**
     * Returns value of date.
     */
    public String getDate(){
        return this.date;
    }

    /**
     * Method created so that we can set a new date when we edit an entry.
     */
    public void setDate(String newDate) {
        this.date = newDate;
    }

    /**
     * Returns the value of Emotion.
     */
    public String getEmotion(){
        return this.emotion;
    }

    /**
     * This method sets a new value for Emotion. It is protected because only the initializer of
     * the sub-class should be able to access it. Once an Emotion has been set by the sub-class
     * initializer, it should never be changed until the destruction of the class.
     */
    protected void setEmotion(String newEmotion){
        this.emotion = newEmotion;
    }

    /**
     * Method for setting a new comment to this value.
     */
    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * Returning the value of comment.
     */
    public String getComment() {
        return this.comment;
    }
}
