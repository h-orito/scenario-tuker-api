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
 * The entity of RULE_BOOK as TABLE. <br>
 * <pre>
 * [primary-key]
 *     rule_book_id
 *
 * [column]
 *     rule_book_id, game_system_id, rule_book_name, rule_book_type, register_datetime, register_trace, update_datetime, update_trace
 *
 * [sequence]
 *     
 *
 * [identity]
 *     rule_book_id
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     GAME_SYSTEM
 *
 * [referrer table]
 *     PARTICIPATE_RULE_BOOK, RULE_BOOK_DICTIONARY, USER_RULE_BOOK
 *
 * [foreign property]
 *     gameSystem
 *
 * [referrer property]
 *     participateRuleBookList, ruleBookDictionaryList, userRuleBookList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer ruleBookId = entity.getRuleBookId();
 * Integer gameSystemId = entity.getGameSystemId();
 * String ruleBookName = entity.getRuleBookName();
 * String ruleBookType = entity.getRuleBookType();
 * java.time.LocalDateTime registerDatetime = entity.getRegisterDatetime();
 * String registerTrace = entity.getRegisterTrace();
 * java.time.LocalDateTime updateDatetime = entity.getUpdateDatetime();
 * String updateTrace = entity.getUpdateTrace();
 * entity.setRuleBookId(ruleBookId);
 * entity.setGameSystemId(gameSystemId);
 * entity.setRuleBookName(ruleBookName);
 * entity.setRuleBookType(ruleBookType);
 * entity.setRegisterDatetime(registerDatetime);
 * entity.setRegisterTrace(registerTrace);
 * entity.setUpdateDatetime(updateDatetime);
 * entity.setUpdateTrace(updateTrace);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class DbBsRuleBook extends AbstractEntity implements DomainEntity, DbEntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** rule_book_id: {PK, ID, NotNull, INT UNSIGNED(10)} */
    protected Integer _ruleBookId;

    /** game_system_id: {IX, NotNull, INT UNSIGNED(10), FK to game_system} */
    protected Integer _gameSystemId;

    /** rule_book_name: {NotNull, VARCHAR(255)} */
    protected String _ruleBookName;

    /** rule_book_type: {NotNull, VARCHAR(50)} */
    protected String _ruleBookType;

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
        return "rule_book";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_ruleBookId == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** GAME_SYSTEM by my game_system_id, named 'gameSystem'. */
    protected OptionalEntity<DbGameSystem> _gameSystem;

    /**
     * [get] GAME_SYSTEM by my game_system_id, named 'gameSystem'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'gameSystem'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<DbGameSystem> getGameSystem() {
        if (_gameSystem == null) { _gameSystem = OptionalEntity.relationEmpty(this, "gameSystem"); }
        return _gameSystem;
    }

    /**
     * [set] GAME_SYSTEM by my game_system_id, named 'gameSystem'.
     * @param gameSystem The entity of foreign property 'gameSystem'. (NullAllowed)
     */
    public void setGameSystem(OptionalEntity<DbGameSystem> gameSystem) {
        _gameSystem = gameSystem;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** PARTICIPATE_RULE_BOOK by rule_book_id, named 'participateRuleBookList'. */
    protected List<DbParticipateRuleBook> _participateRuleBookList;

    /**
     * [get] PARTICIPATE_RULE_BOOK by rule_book_id, named 'participateRuleBookList'.
     * @return The entity list of referrer property 'participateRuleBookList'. (NotNull: even if no loading, returns empty list)
     */
    public List<DbParticipateRuleBook> getParticipateRuleBookList() {
        if (_participateRuleBookList == null) { _participateRuleBookList = newReferrerList(); }
        return _participateRuleBookList;
    }

    /**
     * [set] PARTICIPATE_RULE_BOOK by rule_book_id, named 'participateRuleBookList'.
     * @param participateRuleBookList The entity list of referrer property 'participateRuleBookList'. (NullAllowed)
     */
    public void setParticipateRuleBookList(List<DbParticipateRuleBook> participateRuleBookList) {
        _participateRuleBookList = participateRuleBookList;
    }

    /** RULE_BOOK_DICTIONARY by rule_book_id, named 'ruleBookDictionaryList'. */
    protected List<DbRuleBookDictionary> _ruleBookDictionaryList;

    /**
     * [get] RULE_BOOK_DICTIONARY by rule_book_id, named 'ruleBookDictionaryList'.
     * @return The entity list of referrer property 'ruleBookDictionaryList'. (NotNull: even if no loading, returns empty list)
     */
    public List<DbRuleBookDictionary> getRuleBookDictionaryList() {
        if (_ruleBookDictionaryList == null) { _ruleBookDictionaryList = newReferrerList(); }
        return _ruleBookDictionaryList;
    }

    /**
     * [set] RULE_BOOK_DICTIONARY by rule_book_id, named 'ruleBookDictionaryList'.
     * @param ruleBookDictionaryList The entity list of referrer property 'ruleBookDictionaryList'. (NullAllowed)
     */
    public void setRuleBookDictionaryList(List<DbRuleBookDictionary> ruleBookDictionaryList) {
        _ruleBookDictionaryList = ruleBookDictionaryList;
    }

    /** USER_RULE_BOOK by rule_book_id, named 'userRuleBookList'. */
    protected List<DbUserRuleBook> _userRuleBookList;

    /**
     * [get] USER_RULE_BOOK by rule_book_id, named 'userRuleBookList'.
     * @return The entity list of referrer property 'userRuleBookList'. (NotNull: even if no loading, returns empty list)
     */
    public List<DbUserRuleBook> getUserRuleBookList() {
        if (_userRuleBookList == null) { _userRuleBookList = newReferrerList(); }
        return _userRuleBookList;
    }

    /**
     * [set] USER_RULE_BOOK by rule_book_id, named 'userRuleBookList'.
     * @param userRuleBookList The entity list of referrer property 'userRuleBookList'. (NullAllowed)
     */
    public void setUserRuleBookList(List<DbUserRuleBook> userRuleBookList) {
        _userRuleBookList = userRuleBookList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof DbBsRuleBook) {
            DbBsRuleBook other = (DbBsRuleBook)obj;
            if (!xSV(_ruleBookId, other._ruleBookId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _ruleBookId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_gameSystem != null && _gameSystem.isPresent())
        { sb.append(li).append(xbRDS(_gameSystem, "gameSystem")); }
        if (_participateRuleBookList != null) { for (DbParticipateRuleBook et : _participateRuleBookList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "participateRuleBookList")); } } }
        if (_ruleBookDictionaryList != null) { for (DbRuleBookDictionary et : _ruleBookDictionaryList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "ruleBookDictionaryList")); } } }
        if (_userRuleBookList != null) { for (DbUserRuleBook et : _userRuleBookList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "userRuleBookList")); } } }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_ruleBookId));
        sb.append(dm).append(xfND(_gameSystemId));
        sb.append(dm).append(xfND(_ruleBookName));
        sb.append(dm).append(xfND(_ruleBookType));
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
        if (_gameSystem != null && _gameSystem.isPresent())
        { sb.append(dm).append("gameSystem"); }
        if (_participateRuleBookList != null && !_participateRuleBookList.isEmpty())
        { sb.append(dm).append("participateRuleBookList"); }
        if (_ruleBookDictionaryList != null && !_ruleBookDictionaryList.isEmpty())
        { sb.append(dm).append("ruleBookDictionaryList"); }
        if (_userRuleBookList != null && !_userRuleBookList.isEmpty())
        { sb.append(dm).append("userRuleBookList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public DbRuleBook clone() {
        return (DbRuleBook)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] rule_book_id: {PK, ID, NotNull, INT UNSIGNED(10)} <br>
     * @return The value of the column 'rule_book_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getRuleBookId() {
        checkSpecifiedProperty("ruleBookId");
        return _ruleBookId;
    }

    /**
     * [set] rule_book_id: {PK, ID, NotNull, INT UNSIGNED(10)} <br>
     * @param ruleBookId The value of the column 'rule_book_id'. (basically NotNull if update: for the constraint)
     */
    public void setRuleBookId(Integer ruleBookId) {
        registerModifiedProperty("ruleBookId");
        _ruleBookId = ruleBookId;
    }

    /**
     * [get] game_system_id: {IX, NotNull, INT UNSIGNED(10), FK to game_system} <br>
     * @return The value of the column 'game_system_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getGameSystemId() {
        checkSpecifiedProperty("gameSystemId");
        return _gameSystemId;
    }

    /**
     * [set] game_system_id: {IX, NotNull, INT UNSIGNED(10), FK to game_system} <br>
     * @param gameSystemId The value of the column 'game_system_id'. (basically NotNull if update: for the constraint)
     */
    public void setGameSystemId(Integer gameSystemId) {
        registerModifiedProperty("gameSystemId");
        _gameSystemId = gameSystemId;
    }

    /**
     * [get] rule_book_name: {NotNull, VARCHAR(255)} <br>
     * @return The value of the column 'rule_book_name'. (basically NotNull if selected: for the constraint)
     */
    public String getRuleBookName() {
        checkSpecifiedProperty("ruleBookName");
        return convertEmptyToNull(_ruleBookName);
    }

    /**
     * [set] rule_book_name: {NotNull, VARCHAR(255)} <br>
     * @param ruleBookName The value of the column 'rule_book_name'. (basically NotNull if update: for the constraint)
     */
    public void setRuleBookName(String ruleBookName) {
        registerModifiedProperty("ruleBookName");
        _ruleBookName = ruleBookName;
    }

    /**
     * [get] rule_book_type: {NotNull, VARCHAR(50)} <br>
     * @return The value of the column 'rule_book_type'. (basically NotNull if selected: for the constraint)
     */
    public String getRuleBookType() {
        checkSpecifiedProperty("ruleBookType");
        return convertEmptyToNull(_ruleBookType);
    }

    /**
     * [set] rule_book_type: {NotNull, VARCHAR(50)} <br>
     * @param ruleBookType The value of the column 'rule_book_type'. (basically NotNull if update: for the constraint)
     */
    public void setRuleBookType(String ruleBookType) {
        registerModifiedProperty("ruleBookType");
        _ruleBookType = ruleBookType;
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
