package org.spring.models;

import org.spring.support.Magic;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 * Class.
 */
public class User {

    @NotNull
    @Size(min = Magic.SEVEN, max = Magic.SEVEN)
    private String id;

    @NotNull
    @Size(min = Magic.TRHEE, max = Magic.TEN)
    private String password;

    @NotNull
    @Size(min = Magic.TRHEE, max = Magic.TEN)
    private String name;

    @NotNull
    @Size(min = Magic.TRHEE, max = Magic.TEN)
    private String lastName;

    @NotNull
    @Size(min = Magic.TEN, max = Magic.TEN)
    @Pattern(regexp = "([12]\\d{3}-(0[1-9]|1[0-2])-(0[1-9]|[12]\\d|3[01]))")
    private String birthDate;

    @Size(min = Magic.SEVEN, max = Magic.THIRTY)
    @Pattern(regexp = "^([a-zA-Z0-9_\\-.]+)@([a-zA-Z0-9_\\-.]+)\\.([a-zA-Z]{2,5})$")
    private String email;

    @Size(min = Magic.FIVE, max = Magic.SIX)
    @Pattern(regexp = "(admin|seller|client)")
    private String type;

    /**
     * Constructor.
     */
    public User() {
    }

    /**
     * @return id.
     */
    public String getId() {
        return id;
    }

    /**
     * @param id id.
     */
    public void setId(final String id) {
        this.id = id;
    }

    /**
     * @return password.
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password password.
     */
    public void setPassword(final String password) {
        this.password = password;
    }

    /**
     * @return name.
     */
    public String getName() {
        return name;
    }

    /**
     * @param name name.
     */
    public void setName(final String name) {
        this.name = name;
    }

    /**
     * @return lastName.
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName setLastName.
     */
    public void setLastName(final String lastName) {
        this.lastName = lastName;
    }


    /**
     * @return birthDate.
     */
    public String getBirthDate() {
        return birthDate;
    }

    /**
     * @param birthDate setBirthDate.
     */
    public void setBirthDate(final String birthDate) {
        this.birthDate = birthDate;
    }

    /**
     * @return email.
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email email.
     */
    public void setEmail(final String email) {
        this.email = email;
    }

    /**
     * @return type.
     */
    public String getType() {
        return type;
    }

    /**
     * @param type type.
     */
    public void setType(final String type) {
        this.type = type;
    }

}
