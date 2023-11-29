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
 * The entity of PARTICIPATE as TABLE. <br>
 * <pre>
 * [primary-key]
 *     participate_id
 *
 * [column]
 *     participate_id, scenario_id, user_id, disp_order, participate_term_from, participate_term_to, player_num, game_master, player_names, required_hours, memo, register_datetime, register_trace, update_datetime, update_trace
 *
 * [sequence]
 *     
 *
 * [identity]
 *     participate_id
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     SCENARIO, USER, PARTICIPATE_IMPRESSION(AsOne)
 *
 * [referrer table]
 *     PARTICIPATE_ROLE, PARTICIPATE_RULE_BOOK, PARTICIPATE_IMPRESSION
 *
 * [foreign property]
 *     scenario, user, participateImpressionAsOne
 *
 * [referrer property]
 *     participateRoleList, participateRuleBookList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer participateId = entity.getParticipateId();
 * Integer scenarioId = entity.getScenarioId();
 * Integer userId = entity.getUserId();
 * Integer dispOrder = entity.getDispOrder();
 * java.time.LocalDate participateTermFrom = entity.getParticipateTermFrom();
 * java.time.LocalDate participateTermTo = entity.getParticipateTermTo();
 * Integer playerNum = entity.getPlayerNum();
 * String gameMaster = entity.getGameMaster();
 * String playerNames = entity.getPlayerNames();
 * Integer requiredHours = entity.getRequiredHours();
 * String memo = entity.getMemo();
 * java.time.LocalDateTime registerDatetime = entity.getRegisterDatetime();
 * String registerTrace = entity.getRegisterTrace();
 * java.time.LocalDateTime updateDatetime = entity.getUpdateDatetime();
 * String updateTrace = entity.getUpdateTrace();
 * entity.setParticipateId(participateId);
 * entity.setScenarioId(scenarioId);
 * entity.setUserId(userId);
 * entity.setDispOrder(dispOrder);
 * entity.setParticipateTermFrom(participateTermFrom);
 * entity.setParticipateTermTo(participateTermTo);
 * entity.setPlayerNum(playerNum);
 * entity.setGameMaster(gameMaster);
 * entity.setPlayerNames(playerNames);
 * entity.setRequiredHours(requiredHours);
 * entity.setMemo(memo);
 * entity.setRegisterDatetime(registerDatetime);
 * entity.setRegisterTrace(registerTrace);
 * entity.setUpdateDatetime(updateDatetime);
 * entity.setUpdateTrace(updateTrace);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class DbBsParticipate extends AbstractEntity implements DomainEntity, DbEntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** participate_id: {PK, ID, NotNull, INT UNSIGNED(10)} */
    protected Integer _participateId;

    /** scenario_id: {IX, NotNull, INT UNSIGNED(10), FK to scenario} */
    protected Integer _scenarioId;

    /** user_id: {IX, NotNull, INT UNSIGNED(10), FK to user} */
    protected Integer _userId;

    /** disp_order: {NotNull, INT UNSIGNED(10)} */
    protected Integer _dispOrder;

    /** participate_term_from: {DATE(10)} */
    protected java.time.LocalDate _participateTermFrom;

    /** participate_term_to: {DATE(10)} */
    protected java.time.LocalDate _participateTermTo;

    /** player_num: {INT UNSIGNED(10)} */
    protected Integer _playerNum;

    /** game_master: {VARCHAR(255)} */
    protected String _gameMaster;

    /** player_names: {VARCHAR(255)} */
    protected String _playerNames;

    /** required_hours: {INT UNSIGNED(10)} */
    protected Integer _requiredHours;

    /** memo: {VARCHAR(255)} */
    protected String _memo;

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
        return "participate";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_participateId == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** SCENARIO by my scenario_id, named 'scenario'. */
    protected OptionalEntity<DbScenario> _scenario;

    /**
     * [get] SCENARIO by my scenario_id, named 'scenario'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'scenario'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<DbScenario> getScenario() {
        if (_scenario == null) { _scenario = OptionalEntity.relationEmpty(this, "scenario"); }
        return _scenario;
    }

    /**
     * [set] SCENARIO by my scenario_id, named 'scenario'.
     * @param scenario The entity of foreign property 'scenario'. (NullAllowed)
     */
    public void setScenario(OptionalEntity<DbScenario> scenario) {
        _scenario = scenario;
    }

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

    /** participate_impression by participate_id, named 'participateImpressionAsOne'. */
    protected OptionalEntity<DbParticipateImpression> _participateImpressionAsOne;

    /**
     * [get] participate_impression by participate_id, named 'participateImpressionAsOne'.
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return the entity of foreign property(referrer-as-one) 'participateImpressionAsOne'. (NotNull, EmptyAllowed: when e.g. no data, no setupSelect)
     */
    public OptionalEntity<DbParticipateImpression> getParticipateImpressionAsOne() {
        if (_participateImpressionAsOne == null) { _participateImpressionAsOne = OptionalEntity.relationEmpty(this, "participateImpressionAsOne"); }
        return _participateImpressionAsOne;
    }

    /**
     * [set] participate_impression by participate_id, named 'participateImpressionAsOne'.
     * @param participateImpressionAsOne The entity of foreign property(referrer-as-one) 'participateImpressionAsOne'. (NullAllowed)
     */
    public void setParticipateImpressionAsOne(OptionalEntity<DbParticipateImpression> participateImpressionAsOne) {
        _participateImpressionAsOne = participateImpressionAsOne;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** PARTICIPATE_ROLE by participate_id, named 'participateRoleList'. */
    protected List<DbParticipateRole> _participateRoleList;

    /**
     * [get] PARTICIPATE_ROLE by participate_id, named 'participateRoleList'.
     * @return The entity list of referrer property 'participateRoleList'. (NotNull: even if no loading, returns empty list)
     */
    public List<DbParticipateRole> getParticipateRoleList() {
        if (_participateRoleList == null) { _participateRoleList = newReferrerList(); }
        return _participateRoleList;
    }

    /**
     * [set] PARTICIPATE_ROLE by participate_id, named 'participateRoleList'.
     * @param participateRoleList The entity list of referrer property 'participateRoleList'. (NullAllowed)
     */
    public void setParticipateRoleList(List<DbParticipateRole> participateRoleList) {
        _participateRoleList = participateRoleList;
    }

    /** PARTICIPATE_RULE_BOOK by participate_id, named 'participateRuleBookList'. */
    protected List<DbParticipateRuleBook> _participateRuleBookList;

    /**
     * [get] PARTICIPATE_RULE_BOOK by participate_id, named 'participateRuleBookList'.
     * @return The entity list of referrer property 'participateRuleBookList'. (NotNull: even if no loading, returns empty list)
     */
    public List<DbParticipateRuleBook> getParticipateRuleBookList() {
        if (_participateRuleBookList == null) { _participateRuleBookList = newReferrerList(); }
        return _participateRuleBookList;
    }

    /**
     * [set] PARTICIPATE_RULE_BOOK by participate_id, named 'participateRuleBookList'.
     * @param participateRuleBookList The entity list of referrer property 'participateRuleBookList'. (NullAllowed)
     */
    public void setParticipateRuleBookList(List<DbParticipateRuleBook> participateRuleBookList) {
        _participateRuleBookList = participateRuleBookList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof DbBsParticipate) {
            DbBsParticipate other = (DbBsParticipate)obj;
            if (!xSV(_participateId, other._participateId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _participateId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_scenario != null && _scenario.isPresent())
        { sb.append(li).append(xbRDS(_scenario, "scenario")); }
        if (_user != null && _user.isPresent())
        { sb.append(li).append(xbRDS(_user, "user")); }
        if (_participateImpressionAsOne != null && _participateImpressionAsOne.isPresent())
        { sb.append(li).append(xbRDS(_participateImpressionAsOne, "participateImpressionAsOne")); }
        if (_participateRoleList != null) { for (DbParticipateRole et : _participateRoleList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "participateRoleList")); } } }
        if (_participateRuleBookList != null) { for (DbParticipateRuleBook et : _participateRuleBookList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "participateRuleBookList")); } } }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_participateId));
        sb.append(dm).append(xfND(_scenarioId));
        sb.append(dm).append(xfND(_userId));
        sb.append(dm).append(xfND(_dispOrder));
        sb.append(dm).append(xfND(_participateTermFrom));
        sb.append(dm).append(xfND(_participateTermTo));
        sb.append(dm).append(xfND(_playerNum));
        sb.append(dm).append(xfND(_gameMaster));
        sb.append(dm).append(xfND(_playerNames));
        sb.append(dm).append(xfND(_requiredHours));
        sb.append(dm).append(xfND(_memo));
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
        if (_scenario != null && _scenario.isPresent())
        { sb.append(dm).append("scenario"); }
        if (_user != null && _user.isPresent())
        { sb.append(dm).append("user"); }
        if (_participateImpressionAsOne != null && _participateImpressionAsOne.isPresent())
        { sb.append(dm).append("participateImpressionAsOne"); }
        if (_participateRoleList != null && !_participateRoleList.isEmpty())
        { sb.append(dm).append("participateRoleList"); }
        if (_participateRuleBookList != null && !_participateRuleBookList.isEmpty())
        { sb.append(dm).append("participateRuleBookList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public DbParticipate clone() {
        return (DbParticipate)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] participate_id: {PK, ID, NotNull, INT UNSIGNED(10)} <br>
     * @return The value of the column 'participate_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getParticipateId() {
        checkSpecifiedProperty("participateId");
        return _participateId;
    }

    /**
     * [set] participate_id: {PK, ID, NotNull, INT UNSIGNED(10)} <br>
     * @param participateId The value of the column 'participate_id'. (basically NotNull if update: for the constraint)
     */
    public void setParticipateId(Integer participateId) {
        registerModifiedProperty("participateId");
        _participateId = participateId;
    }

    /**
     * [get] scenario_id: {IX, NotNull, INT UNSIGNED(10), FK to scenario} <br>
     * @return The value of the column 'scenario_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getScenarioId() {
        checkSpecifiedProperty("scenarioId");
        return _scenarioId;
    }

    /**
     * [set] scenario_id: {IX, NotNull, INT UNSIGNED(10), FK to scenario} <br>
     * @param scenarioId The value of the column 'scenario_id'. (basically NotNull if update: for the constraint)
     */
    public void setScenarioId(Integer scenarioId) {
        registerModifiedProperty("scenarioId");
        _scenarioId = scenarioId;
    }

    /**
     * [get] user_id: {IX, NotNull, INT UNSIGNED(10), FK to user} <br>
     * @return The value of the column 'user_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getUserId() {
        checkSpecifiedProperty("userId");
        return _userId;
    }

    /**
     * [set] user_id: {IX, NotNull, INT UNSIGNED(10), FK to user} <br>
     * @param userId The value of the column 'user_id'. (basically NotNull if update: for the constraint)
     */
    public void setUserId(Integer userId) {
        registerModifiedProperty("userId");
        _userId = userId;
    }

    /**
     * [get] disp_order: {NotNull, INT UNSIGNED(10)} <br>
     * @return The value of the column 'disp_order'. (basically NotNull if selected: for the constraint)
     */
    public Integer getDispOrder() {
        checkSpecifiedProperty("dispOrder");
        return _dispOrder;
    }

    /**
     * [set] disp_order: {NotNull, INT UNSIGNED(10)} <br>
     * @param dispOrder The value of the column 'disp_order'. (basically NotNull if update: for the constraint)
     */
    public void setDispOrder(Integer dispOrder) {
        registerModifiedProperty("dispOrder");
        _dispOrder = dispOrder;
    }

    /**
     * [get] participate_term_from: {DATE(10)} <br>
     * @return The value of the column 'participate_term_from'. (NullAllowed even if selected: for no constraint)
     */
    public java.time.LocalDate getParticipateTermFrom() {
        checkSpecifiedProperty("participateTermFrom");
        return _participateTermFrom;
    }

    /**
     * [set] participate_term_from: {DATE(10)} <br>
     * @param participateTermFrom The value of the column 'participate_term_from'. (NullAllowed: null update allowed for no constraint)
     */
    public void setParticipateTermFrom(java.time.LocalDate participateTermFrom) {
        registerModifiedProperty("participateTermFrom");
        _participateTermFrom = participateTermFrom;
    }

    /**
     * [get] participate_term_to: {DATE(10)} <br>
     * @return The value of the column 'participate_term_to'. (NullAllowed even if selected: for no constraint)
     */
    public java.time.LocalDate getParticipateTermTo() {
        checkSpecifiedProperty("participateTermTo");
        return _participateTermTo;
    }

    /**
     * [set] participate_term_to: {DATE(10)} <br>
     * @param participateTermTo The value of the column 'participate_term_to'. (NullAllowed: null update allowed for no constraint)
     */
    public void setParticipateTermTo(java.time.LocalDate participateTermTo) {
        registerModifiedProperty("participateTermTo");
        _participateTermTo = participateTermTo;
    }

    /**
     * [get] player_num: {INT UNSIGNED(10)} <br>
     * @return The value of the column 'player_num'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getPlayerNum() {
        checkSpecifiedProperty("playerNum");
        return _playerNum;
    }

    /**
     * [set] player_num: {INT UNSIGNED(10)} <br>
     * @param playerNum The value of the column 'player_num'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPlayerNum(Integer playerNum) {
        registerModifiedProperty("playerNum");
        _playerNum = playerNum;
    }

    /**
     * [get] game_master: {VARCHAR(255)} <br>
     * @return The value of the column 'game_master'. (NullAllowed even if selected: for no constraint)
     */
    public String getGameMaster() {
        checkSpecifiedProperty("gameMaster");
        return convertEmptyToNull(_gameMaster);
    }

    /**
     * [set] game_master: {VARCHAR(255)} <br>
     * @param gameMaster The value of the column 'game_master'. (NullAllowed: null update allowed for no constraint)
     */
    public void setGameMaster(String gameMaster) {
        registerModifiedProperty("gameMaster");
        _gameMaster = gameMaster;
    }

    /**
     * [get] player_names: {VARCHAR(255)} <br>
     * @return The value of the column 'player_names'. (NullAllowed even if selected: for no constraint)
     */
    public String getPlayerNames() {
        checkSpecifiedProperty("playerNames");
        return convertEmptyToNull(_playerNames);
    }

    /**
     * [set] player_names: {VARCHAR(255)} <br>
     * @param playerNames The value of the column 'player_names'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPlayerNames(String playerNames) {
        registerModifiedProperty("playerNames");
        _playerNames = playerNames;
    }

    /**
     * [get] required_hours: {INT UNSIGNED(10)} <br>
     * @return The value of the column 'required_hours'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getRequiredHours() {
        checkSpecifiedProperty("requiredHours");
        return _requiredHours;
    }

    /**
     * [set] required_hours: {INT UNSIGNED(10)} <br>
     * @param requiredHours The value of the column 'required_hours'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRequiredHours(Integer requiredHours) {
        registerModifiedProperty("requiredHours");
        _requiredHours = requiredHours;
    }

    /**
     * [get] memo: {VARCHAR(255)} <br>
     * @return The value of the column 'memo'. (NullAllowed even if selected: for no constraint)
     */
    public String getMemo() {
        checkSpecifiedProperty("memo");
        return convertEmptyToNull(_memo);
    }

    /**
     * [set] memo: {VARCHAR(255)} <br>
     * @param memo The value of the column 'memo'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMemo(String memo) {
        registerModifiedProperty("memo");
        _memo = memo;
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
