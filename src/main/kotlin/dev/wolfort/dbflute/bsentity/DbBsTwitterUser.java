package dev.wolfort.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.Entity;
import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import org.dbflute.optional.OptionalEntity;
import dev.wolfort.dbflute.allcommon.DbEntityDefinedCommonColumn;
import dev.wolfort.dbflute.allcommon.DbDBMetaInstanceHandler;
import dev.wolfort.dbflute.exentity.*;

/**
 * The entity of TWITTER_USER as TABLE. <br>
 * <pre>
 * [primary-key]
 *     twitter_user_id
 *
 * [column]
 *     twitter_user_id, user_id, twitter_id, screen_name, access_token, token_secret, register_datetime, register_trace, update_datetime, update_trace
 *
 * [sequence]
 *     
 *
 * [identity]
 *     twitter_user_id
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     USER
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     user
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer twitterUserId = entity.getTwitterUserId();
 * Integer userId = entity.getUserId();
 * String twitterId = entity.getTwitterId();
 * String screenName = entity.getScreenName();
 * String accessToken = entity.getAccessToken();
 * String tokenSecret = entity.getTokenSecret();
 * java.time.LocalDateTime registerDatetime = entity.getRegisterDatetime();
 * String registerTrace = entity.getRegisterTrace();
 * java.time.LocalDateTime updateDatetime = entity.getUpdateDatetime();
 * String updateTrace = entity.getUpdateTrace();
 * entity.setTwitterUserId(twitterUserId);
 * entity.setUserId(userId);
 * entity.setTwitterId(twitterId);
 * entity.setScreenName(screenName);
 * entity.setAccessToken(accessToken);
 * entity.setTokenSecret(tokenSecret);
 * entity.setRegisterDatetime(registerDatetime);
 * entity.setRegisterTrace(registerTrace);
 * entity.setUpdateDatetime(updateDatetime);
 * entity.setUpdateTrace(updateTrace);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class DbBsTwitterUser extends AbstractEntity implements DomainEntity, DbEntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** twitter_user_id: {PK, ID, NotNull, INT UNSIGNED(10)} */
    protected Integer _twitterUserId;

    /** user_id: {UQ, NotNull, INT UNSIGNED(10), FK to user} */
    protected Integer _userId;

    /** twitter_id: {NotNull, VARCHAR(255)} */
    protected String _twitterId;

    /** screen_name: {NotNull, VARCHAR(255)} */
    protected String _screenName;

    /** access_token: {NotNull, VARCHAR(255)} */
    protected String _accessToken;

    /** token_secret: {NotNull, VARCHAR(255)} */
    protected String _tokenSecret;

    /** register_datetime: {NotNull, DATETIME(19)} */
    protected java.time.LocalDateTime _registerDatetime;

    /** register_trace: {NotNull, VARCHAR(64)} */
    protected String _registerTrace;

    /** update_datetime: {NotNull, DATETIME(19)} */
    protected java.time.LocalDateTime _updateDatetime;

    /** update_trace: {NotNull, VARCHAR(64)} */
    protected String _updateTrace;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DbDBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "twitter_user";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_twitterUserId == null) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param userId : UQ, NotNull, INT UNSIGNED(10), FK to user. (NotNull)
     */
    public void uniqueBy(Integer userId) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("userId");
        setUserId(userId);
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** USER by my user_id, named 'user'. */
    protected OptionalEntity<DbUser> _user;

    /**
     * [get] USER by my user_id, named 'user'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'user'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<DbUser> getUser() {
        if (_user == null) { _user = OptionalEntity.relationEmpty(this, "user"); }
        return _user;
    }

    /**
     * [set] USER by my user_id, named 'user'.
     * @param user The entity of foreign property 'user'. (NullAllowed)
     */
    public void setUser(OptionalEntity<DbUser> user) {
        _user = user;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof DbBsTwitterUser) {
            DbBsTwitterUser other = (DbBsTwitterUser)obj;
            if (!xSV(_twitterUserId, other._twitterUserId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _twitterUserId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_user != null && _user.isPresent())
        { sb.append(li).append(xbRDS(_user, "user")); }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_twitterUserId));
        sb.append(dm).append(xfND(_userId));
        sb.append(dm).append(xfND(_twitterId));
        sb.append(dm).append(xfND(_screenName));
        sb.append(dm).append(xfND(_accessToken));
        sb.append(dm).append(xfND(_tokenSecret));
        sb.append(dm).append(xfND(_registerDatetime));
        sb.append(dm).append(xfND(_registerTrace));
        sb.append(dm).append(xfND(_updateDatetime));
        sb.append(dm).append(xfND(_updateTrace));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_user != null && _user.isPresent())
        { sb.append(dm).append("user"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public DbTwitterUser clone() {
        return (DbTwitterUser)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] twitter_user_id: {PK, ID, NotNull, INT UNSIGNED(10)} <br>
     * @return The value of the column 'twitter_user_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getTwitterUserId() {
        checkSpecifiedProperty("twitterUserId");
        return _twitterUserId;
    }

    /**
     * [set] twitter_user_id: {PK, ID, NotNull, INT UNSIGNED(10)} <br>
     * @param twitterUserId The value of the column 'twitter_user_id'. (basically NotNull if update: for the constraint)
     */
    public void setTwitterUserId(Integer twitterUserId) {
        registerModifiedProperty("twitterUserId");
        _twitterUserId = twitterUserId;
    }

    /**
     * [get] user_id: {UQ, NotNull, INT UNSIGNED(10), FK to user} <br>
     * @return The value of the column 'user_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getUserId() {
        checkSpecifiedProperty("userId");
        return _userId;
    }

    /**
     * [set] user_id: {UQ, NotNull, INT UNSIGNED(10), FK to user} <br>
     * @param userId The value of the column 'user_id'. (basically NotNull if update: for the constraint)
     */
    public void setUserId(Integer userId) {
        registerModifiedProperty("userId");
        _userId = userId;
    }

    /**
     * [get] twitter_id: {NotNull, VARCHAR(255)} <br>
     * @return The value of the column 'twitter_id'. (basically NotNull if selected: for the constraint)
     */
    public String getTwitterId() {
        checkSpecifiedProperty("twitterId");
        return convertEmptyToNull(_twitterId);
    }

    /**
     * [set] twitter_id: {NotNull, VARCHAR(255)} <br>
     * @param twitterId The value of the column 'twitter_id'. (basically NotNull if update: for the constraint)
     */
    public void setTwitterId(String twitterId) {
        registerModifiedProperty("twitterId");
        _twitterId = twitterId;
    }

    /**
     * [get] screen_name: {NotNull, VARCHAR(255)} <br>
     * @return The value of the column 'screen_name'. (basically NotNull if selected: for the constraint)
     */
    public String getScreenName() {
        checkSpecifiedProperty("screenName");
        return convertEmptyToNull(_screenName);
    }

    /**
     * [set] screen_name: {NotNull, VARCHAR(255)} <br>
     * @param screenName The value of the column 'screen_name'. (basically NotNull if update: for the constraint)
     */
    public void setScreenName(String screenName) {
        registerModifiedProperty("screenName");
        _screenName = screenName;
    }

    /**
     * [get] access_token: {NotNull, VARCHAR(255)} <br>
     * @return The value of the column 'access_token'. (basically NotNull if selected: for the constraint)
     */
    public String getAccessToken() {
        checkSpecifiedProperty("accessToken");
        return convertEmptyToNull(_accessToken);
    }

    /**
     * [set] access_token: {NotNull, VARCHAR(255)} <br>
     * @param accessToken The value of the column 'access_token'. (basically NotNull if update: for the constraint)
     */
    public void setAccessToken(String accessToken) {
        registerModifiedProperty("accessToken");
        _accessToken = accessToken;
    }

    /**
     * [get] token_secret: {NotNull, VARCHAR(255)} <br>
     * @return The value of the column 'token_secret'. (basically NotNull if selected: for the constraint)
     */
    public String getTokenSecret() {
        checkSpecifiedProperty("tokenSecret");
        return convertEmptyToNull(_tokenSecret);
    }

    /**
     * [set] token_secret: {NotNull, VARCHAR(255)} <br>
     * @param tokenSecret The value of the column 'token_secret'. (basically NotNull if update: for the constraint)
     */
    public void setTokenSecret(String tokenSecret) {
        registerModifiedProperty("tokenSecret");
        _tokenSecret = tokenSecret;
    }

    /**
     * [get] register_datetime: {NotNull, DATETIME(19)} <br>
     * @return The value of the column 'register_datetime'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDateTime getRegisterDatetime() {
        checkSpecifiedProperty("registerDatetime");
        return _registerDatetime;
    }

    /**
     * [set] register_datetime: {NotNull, DATETIME(19)} <br>
     * @param registerDatetime The value of the column 'register_datetime'. (basically NotNull if update: for the constraint)
     */
    public void setRegisterDatetime(java.time.LocalDateTime registerDatetime) {
        registerModifiedProperty("registerDatetime");
        _registerDatetime = registerDatetime;
    }

    /**
     * [get] register_trace: {NotNull, VARCHAR(64)} <br>
     * @return The value of the column 'register_trace'. (basically NotNull if selected: for the constraint)
     */
    public String getRegisterTrace() {
        checkSpecifiedProperty("registerTrace");
        return convertEmptyToNull(_registerTrace);
    }

    /**
     * [set] register_trace: {NotNull, VARCHAR(64)} <br>
     * @param registerTrace The value of the column 'register_trace'. (basically NotNull if update: for the constraint)
     */
    public void setRegisterTrace(String registerTrace) {
        registerModifiedProperty("registerTrace");
        _registerTrace = registerTrace;
    }

    /**
     * [get] update_datetime: {NotNull, DATETIME(19)} <br>
     * @return The value of the column 'update_datetime'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDateTime getUpdateDatetime() {
        checkSpecifiedProperty("updateDatetime");
        return _updateDatetime;
    }

    /**
     * [set] update_datetime: {NotNull, DATETIME(19)} <br>
     * @param updateDatetime The value of the column 'update_datetime'. (basically NotNull if update: for the constraint)
     */
    public void setUpdateDatetime(java.time.LocalDateTime updateDatetime) {
        registerModifiedProperty("updateDatetime");
        _updateDatetime = updateDatetime;
    }

    /**
     * [get] update_trace: {NotNull, VARCHAR(64)} <br>
     * @return The value of the column 'update_trace'. (basically NotNull if selected: for the constraint)
     */
    public String getUpdateTrace() {
        checkSpecifiedProperty("updateTrace");
        return convertEmptyToNull(_updateTrace);
    }

    /**
     * [set] update_trace: {NotNull, VARCHAR(64)} <br>
     * @param updateTrace The value of the column 'update_trace'. (basically NotNull if update: for the constraint)
     */
    public void setUpdateTrace(String updateTrace) {
        registerModifiedProperty("updateTrace");
        _updateTrace = updateTrace;
    }
}
