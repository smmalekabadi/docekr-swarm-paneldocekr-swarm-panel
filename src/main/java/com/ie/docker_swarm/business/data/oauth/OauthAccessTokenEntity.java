package com.ie.docker_swarm.business.data.oauth;

import javax.persistence.*;
import java.util.Arrays;

/**
 * Created by behzad on 2/25/18.
 */
@Entity
@Table(name = "oauth_access_token", schema = "public")
public class OauthAccessTokenEntity {
    private String tokenId;
    private byte[] token;
    private String authenticationId;
    private String userName;
    private String clientId;
    private byte[] authentication;
    private String refreshToken;

    @Basic
    @Column(name = "token_id", nullable = true, length = 256)
    public String getTokenId() {
        return tokenId;
    }

    public void setTokenId(String tokenId) {
        this.tokenId = tokenId;
    }

    @Basic
    @Column(name = "token", nullable = true)
    public byte[] getToken() {
        return token;
    }

    public void setToken(byte[] token) {
        this.token = token;
    }

    @Id
    @Column(name = "authentication_id", nullable = false, length = 256)
    public String getAuthenticationId() {
        return authenticationId;
    }

    public void setAuthenticationId(String authenticationId) {
        this.authenticationId = authenticationId;
    }

    @Basic
    @Column(name = "user_name", nullable = true, length = 256)
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Basic
    @Column(name = "client_id", nullable = true, length = 256)
    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    @Basic
    @Column(name = "authentication", nullable = true)
    public byte[] getAuthentication() {
        return authentication;
    }

    public void setAuthentication(byte[] authentication) {
        this.authentication = authentication;
    }

    @Basic
    @Column(name = "refresh_token", nullable = true, length = 256)
    public String getRefreshToken() {
        return refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OauthAccessTokenEntity that = (OauthAccessTokenEntity) o;

        if (tokenId != null ? !tokenId.equals(that.tokenId) : that.tokenId != null) return false;
        if (!Arrays.equals(token, that.token)) return false;
        if (authenticationId != null ? !authenticationId.equals(that.authenticationId) : that.authenticationId != null)
            return false;
        if (userName != null ? !userName.equals(that.userName) : that.userName != null) return false;
        if (clientId != null ? !clientId.equals(that.clientId) : that.clientId != null) return false;
        if (!Arrays.equals(authentication, that.authentication)) return false;
        if (refreshToken != null ? !refreshToken.equals(that.refreshToken) : that.refreshToken != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = tokenId != null ? tokenId.hashCode() : 0;
        result = 31 * result + Arrays.hashCode(token);
        result = 31 * result + (authenticationId != null ? authenticationId.hashCode() : 0);
        result = 31 * result + (userName != null ? userName.hashCode() : 0);
        result = 31 * result + (clientId != null ? clientId.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(authentication);
        result = 31 * result + (refreshToken != null ? refreshToken.hashCode() : 0);
        return result;
    }
}
