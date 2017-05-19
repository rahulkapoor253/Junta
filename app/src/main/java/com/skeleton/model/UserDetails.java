package com.skeleton.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by rahulkapoor on 09/05/17.
 */

public class UserDetails implements Parcelable {

    @SerializedName("_id")
    @Expose
    private String id;
    @SerializedName("createdAt")
    @Expose
    private String createdAt;
    @SerializedName("updatedAt")
    @Expose
    private String updatedAt;
    @SerializedName("dob")
    @Expose
    private String dob;
    @SerializedName("countryCode")
    @Expose
    private String countryCode;
    @SerializedName("phoneNo")
    @Expose
    private String phoneNo;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("newNumber")
    @Expose
    private String newNumber;
    @SerializedName("userImages")
    @Expose
    private List<UserImage> userImages = null;
    @SerializedName("admin_deactivateAccount")
    @Expose
    private Boolean adminDeactivateAccount;
    @SerializedName("timeOffset")
    @Expose
    private Integer timeOffset;
    @SerializedName("gender")
    @Expose
    private Object gender;
    @SerializedName("aboutMe")
    @Expose
    private String aboutMe;
    @SerializedName("step2CompleteOrSkip")
    @Expose
    private Boolean step2CompleteOrSkip;
    @SerializedName("step1CompleteOrSkip")
    @Expose
    private Boolean step1CompleteOrSkip;
    @SerializedName("interestCategories")
    @Expose
    private List<Object> interestCategories = null;
    @SerializedName("profilePicURL")
    @Expose
    private ProfilePicURL profilePicURL;
    @SerializedName("defaultAddressId")
    @Expose
    private Object defaultAddressId;
    @SerializedName("phoneVerified")
    private boolean phoneVerified;
    @SerializedName("emailVerified")
    private boolean emailVerified;
    @SerializedName("currentLocation")
    @Expose
    private CurrentLocation currentLocation;

    /**
     *
     * @param in in
     */
    protected UserDetails(final Parcel in) {
        id = in.readString();
        createdAt = in.readString();
        updatedAt = in.readString();
        dob = in.readString();
        countryCode = in.readString();
        phoneNo = in.readString();
        email = in.readString();
        newNumber = in.readString();
        aboutMe = in.readString();
        phoneVerified = in.readByte() != 0;
        emailVerified = in.readByte() != 0;
    }

    /**
     * creator
     */
    public static final Creator<UserDetails> CREATOR = new Creator<UserDetails>() {
        /**
         *
         * @param in in
         * @return return
         */
        @Override
        public UserDetails createFromParcel(final Parcel in) {
            return new UserDetails(in);
        }

        /**
         *
         * @param size size
         * @return return
         */
        @Override
        public UserDetails[] newArray(final int size) {
            return new UserDetails[size];
        }
    };

    /**
     * @return return
     */
    public String getId() {
        return id;
    }

    /**
     * @param id id
     */
    public void setId(final String id) {
        this.id = id;
    }

    /**
     * @return return
     */
    public String getCreatedAt() {
        return createdAt;
    }

    /**
     * @param createdAt created at
     */
    public void setCreatedAt(final String createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * @return return
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    /**
     * @param updatedAt updatedAt
     */
    public void setUpdatedAt(final String updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * @return return
     */
    public String getDob() {
        return dob;
    }

    /**
     * @return true or false if phone number is verified or not
     */
    public boolean getPhoneVerified() {
        return phoneVerified;
    }

    /**
     * @return true or false if email is verified or not
     */
    public boolean getEmailVerified() {
        return emailVerified;
    }

    /**
     * @param dob dob
     */
    public void setDob(final String dob) {
        this.dob = dob;
    }

    /**
     * @return return
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * @param countryCode country code
     */
    public void setCountryCode(final String countryCode) {
        this.countryCode = countryCode;
    }

    /**
     * @return return
     */
    public String getPhoneNo() {
        return phoneNo;
    }

    /**
     * @param phoneNo phoneno
     */
    public void setPhoneNo(final String phoneNo) {
        this.phoneNo = phoneNo;
    }

    /**
     * @return return
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email email
     */
    public void setEmail(final String email) {
        this.email = email;
    }

    /**
     * @return return
     */
    public String getNewNumber() {
        return newNumber;
    }

    /**
     * @param newNumber new Number
     */
    public void setNewNumber(final String newNumber) {
        this.newNumber = newNumber;
    }

    /**
     * @return return userImage
     */
    public List<UserImage> getUserImages() {
        return userImages;
    }

    /**
     * @param userImages userImages
     */
    public void setUserImages(final List<UserImage> userImages) {
        this.userImages = userImages;
    }

    /**
     * @return return
     */
    public Boolean getAdminDeactivateAccount() {
        return adminDeactivateAccount;
    }

    /**
     * @param adminDeactivateAccount adminDeactivate Account
     */
    public void setAdminDeactivateAccount(final Boolean adminDeactivateAccount) {
        this.adminDeactivateAccount = adminDeactivateAccount;
    }

    /**
     * @return time offset
     */
    public Integer getTimeOffset() {
        return timeOffset;
    }

    /**
     * @param timeOffset timeoffset
     */
    public void setTimeOffset(final Integer timeOffset) {
        this.timeOffset = timeOffset;
    }

    /**
     * @return return
     */
    public Object getGender() {
        return gender;
    }

    /**
     * @param gender gender
     */
    public void setGender(final Object gender) {
        this.gender = gender;
    }

    /**
     * @return return
     */
    public String getAboutMe() {
        return aboutMe;
    }

    /**
     * @param aboutMe aboutMe
     */
    public void setAboutMe(final String aboutMe) {
        this.aboutMe = aboutMe;
    }

    /**
     * @return return boolean
     */
    public Boolean getStep2CompleteOrSkip() {
        return step2CompleteOrSkip;
    }

    /**
     * @param step2CompleteOrSkip Step2Compelte or skip
     */
    public void setStep2CompleteOrSkip(final Boolean step2CompleteOrSkip) {
        this.step2CompleteOrSkip = step2CompleteOrSkip;
    }

    /**
     * @return return
     */
    public Boolean getStep1CompleteOrSkip() {
        return step1CompleteOrSkip;
    }

    /**
     * @param step1CompleteOrSkip Step2Compelte or skip
     */
    public void setStep1CompleteOrSkip(final Boolean step1CompleteOrSkip) {
        this.step1CompleteOrSkip = step1CompleteOrSkip;
    }

    /**
     * @return return
     */
    public List<Object> getInterestCategories() {
        return interestCategories;
    }

    /**
     * @param interestCategories interest Categories
     */
    public void setInterestCategories(final List<Object> interestCategories) {
        this.interestCategories = interestCategories;
    }

    /**
     * @return return
     */
    public ProfilePicURL getProfilePicURL() {
        return profilePicURL;
    }

    /**
     * @param profilePicURL profile picture URL
     */
    public void setProfilePicURL(final ProfilePicURL profilePicURL) {
        this.profilePicURL = profilePicURL;
    }

    /**
     * @return return
     */
    public Object getDefaultAddressId() {
        return defaultAddressId;
    }

    /**
     * @param defaultAddressId deafaualt address ID
     */
    public void setDefaultAddressId(final Object defaultAddressId) {
        this.defaultAddressId = defaultAddressId;
    }

    /**
     * @return return
     */
    public CurrentLocation getCurrentLocation() {
        return currentLocation;
    }

    /**
     * @param currentLocation current location;
     */
    public void setCurrentLocation(final CurrentLocation currentLocation) {
        this.currentLocation = currentLocation;
    }

    /**
     * @return describe contents;
     */
    @Override
    public int describeContents() {
        return 0;
    }

    /**
     * @param dest  dest;
     * @param flags flags;
     */
    @Override
    public void writeToParcel(final Parcel dest, final int flags) {
        dest.writeString(id);
        dest.writeString(createdAt);
        dest.writeString(updatedAt);
        dest.writeString(dob);
        dest.writeString(countryCode);
        dest.writeString(phoneNo);
        dest.writeString(email);
        dest.writeString(newNumber);
        dest.writeString(aboutMe);
        dest.writeByte((byte) (phoneVerified ? 1 : 0));
        dest.writeByte((byte) (emailVerified ? 1 : 0));
    }
}
