package dev.wolfort.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
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
 *     rule_book_id, rule_book_name, register_datetime, register_trace, update_datetime, update_trace
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
 *     
 *
 * [referrer table]
 *     RULE_BOOK_DICTIONARY, SCENARIO
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     ruleBookDictionaryList, scenarioList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer ruleBookId = entity.getRuleBookId();
 * String ruleBookName = entity.getRuleBookName();
 * java.time.LocalDateTime registerDatetime = entity.getRegisterDatetime();
 * String registerTrace = entity.getRegisterTrace();
 * java.time.LocalDateTime updateDatetime = entity.getUpdateDatetime();
 * String updateTrace = entity.getUpdateTrace();
 * entity.setRuleBookId(ruleBookId);
 * entity.setRuleBookName(ruleBookName);
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

    /** rule_book_name: {NotNull, VARCHAR(255)} */
    protected String _ruleBookName;

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
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
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

    /** SCENARIO by rule_book_id, named 'scenarioList'. */
    protected List<DbScenario> _scenarioList;

    /**
     * [get] SCENARIO by rule_book_id, named 'scenarioList'.
     * @return The entity list of referrer property 'scenarioList'. (NotNull: even if no loading, returns empty list)
     */
    public List<DbScenario> getScenarioList() {
        if (_scenarioList == null) { _scenarioList = newReferrerList(); }
        return _scenarioList;
    }

    /**
     * [set] SCENARIO by rule_book_id, named 'scenarioList'.
     * @param scenarioList The entity list of referrer property 'scenarioList'. (NullAllowed)
     */
    public void setScenarioList(List<DbScenario> scenarioList) {
        _scenarioList = scenarioList;
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
        if (_ruleBookDictionaryList != null) { for (DbRuleBookDictionary et : _ruleBookDictionaryList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "ruleBookDictionaryList")); } } }
        if (_scenarioList != null) { for (DbScenario et : _scenarioList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "scenarioList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_ruleBookId));
        sb.append(dm).append(xfND(_ruleBookName));
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
        if (_ruleBookDictionaryList != null && !_ruleBookDictionaryList.isEmpty())
        { sb.append(dm).append("ruleBookDictionaryList"); }
        if (_scenarioList != null && !_scenarioList.isEmpty())
        { sb.append(dm).append("scenarioList"); }
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
