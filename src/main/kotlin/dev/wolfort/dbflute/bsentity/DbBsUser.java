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
 * The entity of USER as TABLE. <br>
 * <pre>
 * [primary-key]
 *     user_id
 *
 * [column]
 *     user_id, user_name, uid, authority, introduction, is_deleted, register_datetime, register_trace, update_datetime, update_trace
 *
 * [sequence]
 *     
 *
 * [identity]
 *     user_id
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     TWITTER_USER(AsOne)
 *
 * [referrer table]
 *     PARTICIPATE, USER_RULE_BOOK, USER_SCENARIO, TWITTER_USER
 *
 * [foreign property]
 *     twitterUserAsOne
 *
 * [referrer property]
 *     participateList, userRuleBookList, userScenarioList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer userId = entity.getUserId();
 * String userName = entity.getUserName();
 * String uid = entity.getUid();
 * String authority = entity.getAuthority();
 * String introduction = entity.getIntroduction();
 * Boolean isDeleted = entity.getIsDeleted();
 * java.time.LocalDateTime registerDatetime = entity.getRegisterDatetime();
 * String registerTrace = entity.getRegisterTrace();
 * java.time.LocalDateTime updateDatetime = entity.getUpdateDatetime();
 * String updateTrace = entity.getUpdateTrace();
 * entity.setUserId(userId);
 * entity.setUserName(userName);
 * entity.setUid(uid);
 * entity.setAuthority(authority);
 * entity.setIntroduction(introduction);
 * entity.setIsDeleted(isDeleted);
 * entity.setRegisterDatetime(registerDatetime);
 * entity.setRegisterTrace(registerTrace);
 * entity.setUpdateDatetime(updateDatetime);
 * entity.setUpdateTrace(updateTrace);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class DbBsUser extends AbstractEntity implements DomainEntity, DbEntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** user_id: {PK, ID, NotNull, INT UNSIGNED(10)} */
    protected Integer _userId;

    /** user_name: {NotNull, VARCHAR(50)} */
    protected String _userName;

    /** uid: {UQ, NotNull, VARCHAR(255)} */
    protected String _uid;

    /** authority: {NotNull, VARCHAR(50)} */
    protected String _authority;

    /** introduction: {TEXT(65535)} */
    protected String _introduction;

    /** is_deleted: {NotNull, BIT} */
    protected Boolean _isDeleted;

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
        return "user";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_userId == null) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param uid : UQ, NotNull, VARCHAR(255). (NotNull)
     */
    public void uniqueBy(String uid) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("uid");
        setUid(uid);
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** twitter_user by user_id, named 'twitterUserAsOne'. */
    protected OptionalEntity<DbTwitterUser> _twitterUserAsOne;

    /**
     * [get] twitter_user by user_id, named 'twitterUserAsOne'.
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return the entity of foreign property(referrer-as-one) 'twitterUserAsOne'. (NotNull, EmptyAllowed: when e.g. no data, no setupSelect)
     */
    public OptionalEntity<DbTwitterUser> getTwitterUserAsOne() {
        if (_twitterUserAsOne == null) { _twitterUserAsOne = OptionalEntity.relationEmpty(this, "twitterUserAsOne"); }
        return _twitterUserAsOne;
    }

    /**
     * [set] twitter_user by user_id, named 'twitterUserAsOne'.
     * @param twitterUserAsOne The entity of foreign property(referrer-as-one) 'twitterUserAsOne'. (NullAllowed)
     */
    public void setTwitterUserAsOne(OptionalEntity<DbTwitterUser> twitterUserAsOne) {
        _twitterUserAsOne = twitterUserAsOne;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** PARTICIPATE by user_id, named 'participateList'. */
    protected List<DbParticipate> _participateList;

    /**
     * [get] PARTICIPATE by user_id, named 'participateList'.
     * @return The entity list of referrer property 'participateList'. (NotNull: even if no loading, returns empty list)
     */
    public List<DbParticipate> getParticipateList() {
        if (_participateList == null) { _participateList = newReferrerList(); }
        return _participateList;
    }

    /**
     * [set] PARTICIPATE by user_id, named 'participateList'.
     * @param participateList The entity list of referrer property 'participateList'. (NullAllowed)
     */
    public void setParticipateList(List<DbParticipate> participateList) {
        _participateList = participateList;
    }

    /** USER_RULE_BOOK by user_id, named 'userRuleBookList'. */
    protected List<DbUserRuleBook> _userRuleBookList;

    /**
     * [get] USER_RULE_BOOK by user_id, named 'userRuleBookList'.
     * @return The entity list of referrer property 'userRuleBookList'. (NotNull: even if no loading, returns empty list)
     */
    public List<DbUserRuleBook> getUserRuleBookList() {
        if (_userRuleBookList == null) { _userRuleBookList = newReferrerList(); }
        return _userRuleBookList;
    }

    /**
     * [set] USER_RULE_BOOK by user_id, named 'userRuleBookList'.
     * @param userRuleBookList The entity list of referrer property 'userRuleBookList'. (NullAllowed)
     */
    public void setUserRuleBookList(List<DbUserRuleBook> userRuleBookList) {
        _userRuleBookList = userRuleBookList;
    }

    /** USER_SCENARIO by user_id, named 'userScenarioList'. */
    protected List<DbUserScenario> _userScenarioList;

    /**
     * [get] USER_SCENARIO by user_id, named 'userScenarioList'.
     * @return The entity list of referrer property 'userScenarioList'. (NotNull: even if no loading, returns empty list)
     */
    public List<DbUserScenario> getUserScenarioList() {
        if (_userScenarioList == null) { _userScenarioList = newReferrerList(); }
        return _userScenarioList;
    }

    /**
     * [set] USER_SCENARIO by user_id, named 'userScenarioList'.
     * @param userScenarioList The entity list of referrer property 'userScenarioList'. (NullAllowed)
     */
    public void setUserScenarioList(List<DbUserScenario> userScenarioList) {
        _userScenarioList = userScenarioList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof DbBsUser) {
            DbBsUser other = (DbBsUser)obj;
            if (!xSV(_userId, other._userId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _userId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_twitterUserAsOne != null && _twitterUserAsOne.isPresent())
        { sb.append(li).append(xbRDS(_twitterUserAsOne, "twitterUserAsOne")); }
        if (_participateList != null) { for (DbParticipate et : _participateList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "participateList")); } } }
        if (_userRuleBookList != null) { for (DbUserRuleBook et : _userRuleBookList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "userRuleBookList")); } } }
        if (_userScenarioList != null) { for (DbUserScenario et : _userScenarioList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "userScenarioList")); } } }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_userId));
        sb.append(dm).append(xfND(_userName));
        sb.append(dm).append(xfND(_uid));
        sb.append(dm).append(xfND(_authority));
        sb.append(dm).append(xfND(_introduction));
        sb.append(dm).append(xfND(_isDeleted));
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
        if (_twitterUserAsOne != null && _twitterUserAsOne.isPresent())
        { sb.append(dm).append("twitterUserAsOne"); }
        if (_participateList != null && !_participateList.isEmpty())
        { sb.append(dm).append("participateList"); }
        if (_userRuleBookList != null && !_userRuleBookList.isEmpty())
        { sb.append(dm).append("userRuleBookList"); }
        if (_userScenarioList != null && !_userScenarioList.isEmpty())
        { sb.append(dm).append("userScenarioList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public DbUser clone() {
        return (DbUser)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] user_id: {PK, ID, NotNull, INT UNSIGNED(10)} <br>
     * @return The value of the column 'user_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getUserId() {
        checkSpecifiedProperty("userId");
        return _userId;
    }

    /**
     * [set] user_id: {PK, ID, NotNull, INT UNSIGNED(10)} <br>
     * @param userId The value of the column 'user_id'. (basically NotNull if update: for the constraint)
     */
    public void setUserId(Integer userId) {
        registerModifiedProperty("userId");
        _userId = userId;
    }

    /**
     * [get] user_name: {NotNull, VARCHAR(50)} <br>
     * @return The value of the column 'user_name'. (basically NotNull if selected: for the constraint)
     */
    public String getUserName() {
        checkSpecifiedProperty("userName");
        return convertEmptyToNull(_userName);
    }

    /**
     * [set] user_name: {NotNull, VARCHAR(50)} <br>
     * @param userName The value of the column 'user_name'. (basically NotNull if update: for the constraint)
     */
    public void setUserName(String userName) {
        registerModifiedProperty("userName");
        _userName = userName;
    }

    /**
     * [get] uid: {UQ, NotNull, VARCHAR(255)} <br>
     * @return The value of the column 'uid'. (basically NotNull if selected: for the constraint)
     */
    public String getUid() {
        checkSpecifiedProperty("uid");
        return convertEmptyToNull(_uid);
    }

    /**
     * [set] uid: {UQ, NotNull, VARCHAR(255)} <br>
     * @param uid The value of the column 'uid'. (basically NotNull if update: for the constraint)
     */
    public void setUid(String uid) {
        registerModifiedProperty("uid");
        _uid = uid;
    }

    /**
     * [get] authority: {NotNull, VARCHAR(50)} <br>
     * @return The value of the column 'authority'. (basically NotNull if selected: for the constraint)
     */
    public String getAuthority() {
        checkSpecifiedProperty("authority");
        return convertEmptyToNull(_authority);
    }

    /**
     * [set] authority: {NotNull, VARCHAR(50)} <br>
     * @param authority The value of the column 'authority'. (basically NotNull if update: for the constraint)
     */
    public void setAuthority(String authority) {
        registerModifiedProperty("authority");
        _authority = authority;
    }

    /**
     * [get] introduction: {TEXT(65535)} <br>
     * @return The value of the column 'introduction'. (NullAllowed even if selected: for no constraint)
     */
    public String getIntroduction() {
        checkSpecifiedProperty("introduction");
        return convertEmptyToNull(_introduction);
    }

    /**
     * [set] introduction: {TEXT(65535)} <br>
     * @param introduction The value of the column 'introduction'. (NullAllowed: null update allowed for no constraint)
     */
    public void setIntroduction(String introduction) {
        registerModifiedProperty("introduction");
        _introduction = introduction;
    }

    /**
     * [get] is_deleted: {NotNull, BIT} <br>
     * @return The value of the column 'is_deleted'. (basically NotNull if selected: for the constraint)
     */
    public Boolean getIsDeleted() {
        checkSpecifiedProperty("isDeleted");
        return _isDeleted;
    }

    /**
     * [set] is_deleted: {NotNull, BIT} <br>
     * @param isDeleted The value of the column 'is_deleted'. (basically NotNull if update: for the constraint)
     */
    public void setIsDeleted(Boolean isDeleted) {
        registerModifiedProperty("isDeleted");
        _isDeleted = isDeleted;
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
