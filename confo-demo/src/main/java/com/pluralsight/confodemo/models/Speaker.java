package com.pluralsight.confodemo.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.math.BigInteger;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import org.hibernate.annotations.Type;

@Entity(name = "speakers")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Speaker {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long speaker_id;
  private String speaker_f_name;
  private String speaker_l_name;
  private String speaker_title;
  private String speaker_company;
  private String speaker_bio;


  @ManyToMany(mappedBy = "speakerList")
  @JsonIgnore
  private List<Session> sessionList;

  public Speaker(){}

  public Long getSpeaker_id() {
    return speaker_id;
  }

  public void setSpeaker_id(Long speaker_id) {
    this.speaker_id = speaker_id;
  }

  public String getSpeaker_f_name() {
    return speaker_f_name;
  }

  public void setSpeaker_f_name(String speaker_f_name) {
    this.speaker_f_name = speaker_f_name;
  }

  public String getSpeaker_l_name() {
    return speaker_l_name;
  }

  public void setSpeaker_l_name(String speaker_l_name) {
    this.speaker_l_name = speaker_l_name;
  }

  public String getSpeaker_title() {
    return speaker_title;
  }

  public void setSpeaker_title(String speaker_title) {
    this.speaker_title = speaker_title;
  }

  public String getSpeaker_company() {
    return speaker_company;
  }

  public void setSpeaker_company(String speaker_company) {
    this.speaker_company = speaker_company;
  }

  public String getSpeaker_bio() {
    return speaker_bio;
  }

  public void setSpeaker_bio(String speaker_bio) {
    this.speaker_bio = speaker_bio;
  }

  public List<Session> getSessionList() {
    return sessionList;
  }

  public void setSessionList(List<Session> sessionList) {
    this.sessionList = sessionList;
  }
}
