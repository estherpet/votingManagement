package com.example.votingapp.Candidate;

import com.example.votingapp.Party.Party;
import jakarta.persistence.*;
import lombok.*;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "candidate")
public class Candidate {
    @Id
    private int candidateId;
    private String candidateName;
    private String phoneNumber;
    private String candidateEmail;
    private String candidateAddress;
    private String candidateUserName;
    private String candidatePassword;
    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private Party party;
}
