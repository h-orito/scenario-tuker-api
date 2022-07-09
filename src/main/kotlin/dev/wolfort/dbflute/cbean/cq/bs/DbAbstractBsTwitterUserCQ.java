package dev.wolfort.dbflute.cbean.cq.bs;

import java.util.*;

import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.*;
import org.dbflute.cbean.ckey.*;
import org.dbflute.cbean.coption.*;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.ordering.*;
import org.dbflute.cbean.scoping.*;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.dbmeta.DBMetaProvider;
import dev.wolfort.dbflute.allcommon.*;
import dev.wolfort.dbflute.cbean.*;
import dev.wolfort.dbflute.cbean.cq.*;

/**
 * The abstract condition-query of twitter_user.
 * @author DBFlute(AutoGenerator)
 */
public abstract class DbAbstractBsTwitterUserCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public DbAbstractBsTwitterUserCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    @Override
    protected DBMetaProvider xgetDBMetaProvider() {
        return DbDBMetaInstanceHandler.getProvider();
    }

    public String asTableDbName() {
        return "twitter_user";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * twitter_user_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param twitterUserId The value of twitterUserId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTwitterUserId_Equal(Integer twitterUserId) {
        doSetTwitterUserId_Equal(twitterUserId);
    }

    protected void doSetTwitterUserId_Equal(Integer twitterUserId) {
        regTwitterUserId(CK_EQ, twitterUserId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * twitter_user_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param twitterUserId The value of twitterUserId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTwitterUserId_NotEqual(Integer twitterUserId) {
        doSetTwitterUserId_NotEqual(twitterUserId);
    }

    protected void doSetTwitterUserId_NotEqual(Integer twitterUserId) {
        regTwitterUserId(CK_NES, twitterUserId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * twitter_user_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param twitterUserId The value of twitterUserId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTwitterUserId_GreaterThan(Integer twitterUserId) {
        regTwitterUserId(CK_GT, twitterUserId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * twitter_user_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param twitterUserId The value of twitterUserId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTwitterUserId_LessThan(Integer twitterUserId) {
        regTwitterUserId(CK_LT, twitterUserId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * twitter_user_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param twitterUserId The value of twitterUserId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTwitterUserId_GreaterEqual(Integer twitterUserId) {
        regTwitterUserId(CK_GE, twitterUserId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * twitter_user_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param twitterUserId The value of twitterUserId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTwitterUserId_LessEqual(Integer twitterUserId) {
        regTwitterUserId(CK_LE, twitterUserId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * twitter_user_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param minNumber The min number of twitterUserId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of twitterUserId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setTwitterUserId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setTwitterUserId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * twitter_user_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param minNumber The min number of twitterUserId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of twitterUserId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setTwitterUserId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTwitterUserId(), "twitter_user_id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * twitter_user_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param twitterUserIdList The collection of twitterUserId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTwitterUserId_InScope(Collection<Integer> twitterUserIdList) {
        doSetTwitterUserId_InScope(twitterUserIdList);
    }

    protected void doSetTwitterUserId_InScope(Collection<Integer> twitterUserIdList) {
        regINS(CK_INS, cTL(twitterUserIdList), xgetCValueTwitterUserId(), "twitter_user_id");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * twitter_user_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param twitterUserIdList The collection of twitterUserId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTwitterUserId_NotInScope(Collection<Integer> twitterUserIdList) {
        doSetTwitterUserId_NotInScope(twitterUserIdList);
    }

    protected void doSetTwitterUserId_NotInScope(Collection<Integer> twitterUserIdList) {
        regINS(CK_NINS, cTL(twitterUserIdList), xgetCValueTwitterUserId(), "twitter_user_id");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * twitter_user_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     */
    public void setTwitterUserId_IsNull() { regTwitterUserId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * twitter_user_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     */
    public void setTwitterUserId_IsNotNull() { regTwitterUserId(CK_ISNN, DOBJ); }

    protected void regTwitterUserId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTwitterUserId(), "twitter_user_id"); }
    protected abstract ConditionValue xgetCValueTwitterUserId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * user_id: {UQ, NotNull, INT UNSIGNED(10), FK to user}
     * @param userId The value of userId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserId_Equal(Integer userId) {
        doSetUserId_Equal(userId);
    }

    protected void doSetUserId_Equal(Integer userId) {
        regUserId(CK_EQ, userId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * user_id: {UQ, NotNull, INT UNSIGNED(10), FK to user}
     * @param userId The value of userId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserId_NotEqual(Integer userId) {
        doSetUserId_NotEqual(userId);
    }

    protected void doSetUserId_NotEqual(Integer userId) {
        regUserId(CK_NES, userId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * user_id: {UQ, NotNull, INT UNSIGNED(10), FK to user}
     * @param userId The value of userId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserId_GreaterThan(Integer userId) {
        regUserId(CK_GT, userId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * user_id: {UQ, NotNull, INT UNSIGNED(10), FK to user}
     * @param userId The value of userId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserId_LessThan(Integer userId) {
        regUserId(CK_LT, userId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * user_id: {UQ, NotNull, INT UNSIGNED(10), FK to user}
     * @param userId The value of userId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserId_GreaterEqual(Integer userId) {
        regUserId(CK_GE, userId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * user_id: {UQ, NotNull, INT UNSIGNED(10), FK to user}
     * @param userId The value of userId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserId_LessEqual(Integer userId) {
        regUserId(CK_LE, userId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * user_id: {UQ, NotNull, INT UNSIGNED(10), FK to user}
     * @param minNumber The min number of userId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of userId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setUserId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setUserId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * user_id: {UQ, NotNull, INT UNSIGNED(10), FK to user}
     * @param minNumber The min number of userId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of userId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setUserId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueUserId(), "user_id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * user_id: {UQ, NotNull, INT UNSIGNED(10), FK to user}
     * @param userIdList The collection of userId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserId_InScope(Collection<Integer> userIdList) {
        doSetUserId_InScope(userIdList);
    }

    protected void doSetUserId_InScope(Collection<Integer> userIdList) {
        regINS(CK_INS, cTL(userIdList), xgetCValueUserId(), "user_id");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * user_id: {UQ, NotNull, INT UNSIGNED(10), FK to user}
     * @param userIdList The collection of userId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserId_NotInScope(Collection<Integer> userIdList) {
        doSetUserId_NotInScope(userIdList);
    }

    protected void doSetUserId_NotInScope(Collection<Integer> userIdList) {
        regINS(CK_NINS, cTL(userIdList), xgetCValueUserId(), "user_id");
    }

    protected void regUserId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUserId(), "user_id"); }
    protected abstract ConditionValue xgetCValueUserId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * twitter_id: {NotNull, VARCHAR(255)}
     * @param twitterId The value of twitterId as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTwitterId_Equal(String twitterId) {
        doSetTwitterId_Equal(fRES(twitterId));
    }

    protected void doSetTwitterId_Equal(String twitterId) {
        regTwitterId(CK_EQ, twitterId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * twitter_id: {NotNull, VARCHAR(255)}
     * @param twitterId The value of twitterId as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTwitterId_NotEqual(String twitterId) {
        doSetTwitterId_NotEqual(fRES(twitterId));
    }

    protected void doSetTwitterId_NotEqual(String twitterId) {
        regTwitterId(CK_NES, twitterId);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * twitter_id: {NotNull, VARCHAR(255)}
     * @param twitterId The value of twitterId as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTwitterId_GreaterThan(String twitterId) {
        regTwitterId(CK_GT, fRES(twitterId));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * twitter_id: {NotNull, VARCHAR(255)}
     * @param twitterId The value of twitterId as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTwitterId_LessThan(String twitterId) {
        regTwitterId(CK_LT, fRES(twitterId));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * twitter_id: {NotNull, VARCHAR(255)}
     * @param twitterId The value of twitterId as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTwitterId_GreaterEqual(String twitterId) {
        regTwitterId(CK_GE, fRES(twitterId));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * twitter_id: {NotNull, VARCHAR(255)}
     * @param twitterId The value of twitterId as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTwitterId_LessEqual(String twitterId) {
        regTwitterId(CK_LE, fRES(twitterId));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * twitter_id: {NotNull, VARCHAR(255)}
     * @param twitterIdList The collection of twitterId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTwitterId_InScope(Collection<String> twitterIdList) {
        doSetTwitterId_InScope(twitterIdList);
    }

    protected void doSetTwitterId_InScope(Collection<String> twitterIdList) {
        regINS(CK_INS, cTL(twitterIdList), xgetCValueTwitterId(), "twitter_id");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * twitter_id: {NotNull, VARCHAR(255)}
     * @param twitterIdList The collection of twitterId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTwitterId_NotInScope(Collection<String> twitterIdList) {
        doSetTwitterId_NotInScope(twitterIdList);
    }

    protected void doSetTwitterId_NotInScope(Collection<String> twitterIdList) {
        regINS(CK_NINS, cTL(twitterIdList), xgetCValueTwitterId(), "twitter_id");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * twitter_id: {NotNull, VARCHAR(255)} <br>
     * <pre>e.g. setTwitterId_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param twitterId The value of twitterId as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setTwitterId_LikeSearch(String twitterId, ConditionOptionCall<LikeSearchOption> opLambda) {
        setTwitterId_LikeSearch(twitterId, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * twitter_id: {NotNull, VARCHAR(255)} <br>
     * <pre>e.g. setTwitterId_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param twitterId The value of twitterId as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setTwitterId_LikeSearch(String twitterId, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(twitterId), xgetCValueTwitterId(), "twitter_id", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * twitter_id: {NotNull, VARCHAR(255)}
     * @param twitterId The value of twitterId as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setTwitterId_NotLikeSearch(String twitterId, ConditionOptionCall<LikeSearchOption> opLambda) {
        setTwitterId_NotLikeSearch(twitterId, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * twitter_id: {NotNull, VARCHAR(255)}
     * @param twitterId The value of twitterId as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setTwitterId_NotLikeSearch(String twitterId, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(twitterId), xgetCValueTwitterId(), "twitter_id", likeSearchOption);
    }

    protected void regTwitterId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTwitterId(), "twitter_id"); }
    protected abstract ConditionValue xgetCValueTwitterId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * screen_name: {NotNull, VARCHAR(255)}
     * @param screenName The value of screenName as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setScreenName_Equal(String screenName) {
        doSetScreenName_Equal(fRES(screenName));
    }

    protected void doSetScreenName_Equal(String screenName) {
        regScreenName(CK_EQ, screenName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * screen_name: {NotNull, VARCHAR(255)}
     * @param screenName The value of screenName as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setScreenName_NotEqual(String screenName) {
        doSetScreenName_NotEqual(fRES(screenName));
    }

    protected void doSetScreenName_NotEqual(String screenName) {
        regScreenName(CK_NES, screenName);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * screen_name: {NotNull, VARCHAR(255)}
     * @param screenName The value of screenName as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setScreenName_GreaterThan(String screenName) {
        regScreenName(CK_GT, fRES(screenName));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * screen_name: {NotNull, VARCHAR(255)}
     * @param screenName The value of screenName as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setScreenName_LessThan(String screenName) {
        regScreenName(CK_LT, fRES(screenName));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * screen_name: {NotNull, VARCHAR(255)}
     * @param screenName The value of screenName as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setScreenName_GreaterEqual(String screenName) {
        regScreenName(CK_GE, fRES(screenName));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * screen_name: {NotNull, VARCHAR(255)}
     * @param screenName The value of screenName as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setScreenName_LessEqual(String screenName) {
        regScreenName(CK_LE, fRES(screenName));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * screen_name: {NotNull, VARCHAR(255)}
     * @param screenNameList The collection of screenName as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setScreenName_InScope(Collection<String> screenNameList) {
        doSetScreenName_InScope(screenNameList);
    }

    protected void doSetScreenName_InScope(Collection<String> screenNameList) {
        regINS(CK_INS, cTL(screenNameList), xgetCValueScreenName(), "screen_name");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * screen_name: {NotNull, VARCHAR(255)}
     * @param screenNameList The collection of screenName as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setScreenName_NotInScope(Collection<String> screenNameList) {
        doSetScreenName_NotInScope(screenNameList);
    }

    protected void doSetScreenName_NotInScope(Collection<String> screenNameList) {
        regINS(CK_NINS, cTL(screenNameList), xgetCValueScreenName(), "screen_name");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * screen_name: {NotNull, VARCHAR(255)} <br>
     * <pre>e.g. setScreenName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param screenName The value of screenName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setScreenName_LikeSearch(String screenName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setScreenName_LikeSearch(screenName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * screen_name: {NotNull, VARCHAR(255)} <br>
     * <pre>e.g. setScreenName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param screenName The value of screenName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setScreenName_LikeSearch(String screenName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(screenName), xgetCValueScreenName(), "screen_name", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * screen_name: {NotNull, VARCHAR(255)}
     * @param screenName The value of screenName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setScreenName_NotLikeSearch(String screenName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setScreenName_NotLikeSearch(screenName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * screen_name: {NotNull, VARCHAR(255)}
     * @param screenName The value of screenName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setScreenName_NotLikeSearch(String screenName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(screenName), xgetCValueScreenName(), "screen_name", likeSearchOption);
    }

    protected void regScreenName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueScreenName(), "screen_name"); }
    protected abstract ConditionValue xgetCValueScreenName();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * access_token: {NotNull, VARCHAR(255)}
     * @param accessToken The value of accessToken as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAccessToken_Equal(String accessToken) {
        doSetAccessToken_Equal(fRES(accessToken));
    }

    protected void doSetAccessToken_Equal(String accessToken) {
        regAccessToken(CK_EQ, accessToken);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * access_token: {NotNull, VARCHAR(255)}
     * @param accessToken The value of accessToken as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAccessToken_NotEqual(String accessToken) {
        doSetAccessToken_NotEqual(fRES(accessToken));
    }

    protected void doSetAccessToken_NotEqual(String accessToken) {
        regAccessToken(CK_NES, accessToken);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * access_token: {NotNull, VARCHAR(255)}
     * @param accessToken The value of accessToken as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAccessToken_GreaterThan(String accessToken) {
        regAccessToken(CK_GT, fRES(accessToken));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * access_token: {NotNull, VARCHAR(255)}
     * @param accessToken The value of accessToken as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAccessToken_LessThan(String accessToken) {
        regAccessToken(CK_LT, fRES(accessToken));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * access_token: {NotNull, VARCHAR(255)}
     * @param accessToken The value of accessToken as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAccessToken_GreaterEqual(String accessToken) {
        regAccessToken(CK_GE, fRES(accessToken));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * access_token: {NotNull, VARCHAR(255)}
     * @param accessToken The value of accessToken as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAccessToken_LessEqual(String accessToken) {
        regAccessToken(CK_LE, fRES(accessToken));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * access_token: {NotNull, VARCHAR(255)}
     * @param accessTokenList The collection of accessToken as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAccessToken_InScope(Collection<String> accessTokenList) {
        doSetAccessToken_InScope(accessTokenList);
    }

    protected void doSetAccessToken_InScope(Collection<String> accessTokenList) {
        regINS(CK_INS, cTL(accessTokenList), xgetCValueAccessToken(), "access_token");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * access_token: {NotNull, VARCHAR(255)}
     * @param accessTokenList The collection of accessToken as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAccessToken_NotInScope(Collection<String> accessTokenList) {
        doSetAccessToken_NotInScope(accessTokenList);
    }

    protected void doSetAccessToken_NotInScope(Collection<String> accessTokenList) {
        regINS(CK_NINS, cTL(accessTokenList), xgetCValueAccessToken(), "access_token");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * access_token: {NotNull, VARCHAR(255)} <br>
     * <pre>e.g. setAccessToken_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param accessToken The value of accessToken as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setAccessToken_LikeSearch(String accessToken, ConditionOptionCall<LikeSearchOption> opLambda) {
        setAccessToken_LikeSearch(accessToken, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * access_token: {NotNull, VARCHAR(255)} <br>
     * <pre>e.g. setAccessToken_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param accessToken The value of accessToken as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setAccessToken_LikeSearch(String accessToken, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(accessToken), xgetCValueAccessToken(), "access_token", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * access_token: {NotNull, VARCHAR(255)}
     * @param accessToken The value of accessToken as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setAccessToken_NotLikeSearch(String accessToken, ConditionOptionCall<LikeSearchOption> opLambda) {
        setAccessToken_NotLikeSearch(accessToken, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * access_token: {NotNull, VARCHAR(255)}
     * @param accessToken The value of accessToken as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setAccessToken_NotLikeSearch(String accessToken, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(accessToken), xgetCValueAccessToken(), "access_token", likeSearchOption);
    }

    protected void regAccessToken(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAccessToken(), "access_token"); }
    protected abstract ConditionValue xgetCValueAccessToken();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * token_secret: {NotNull, VARCHAR(255)}
     * @param tokenSecret The value of tokenSecret as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTokenSecret_Equal(String tokenSecret) {
        doSetTokenSecret_Equal(fRES(tokenSecret));
    }

    protected void doSetTokenSecret_Equal(String tokenSecret) {
        regTokenSecret(CK_EQ, tokenSecret);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * token_secret: {NotNull, VARCHAR(255)}
     * @param tokenSecret The value of tokenSecret as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTokenSecret_NotEqual(String tokenSecret) {
        doSetTokenSecret_NotEqual(fRES(tokenSecret));
    }

    protected void doSetTokenSecret_NotEqual(String tokenSecret) {
        regTokenSecret(CK_NES, tokenSecret);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * token_secret: {NotNull, VARCHAR(255)}
     * @param tokenSecret The value of tokenSecret as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTokenSecret_GreaterThan(String tokenSecret) {
        regTokenSecret(CK_GT, fRES(tokenSecret));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * token_secret: {NotNull, VARCHAR(255)}
     * @param tokenSecret The value of tokenSecret as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTokenSecret_LessThan(String tokenSecret) {
        regTokenSecret(CK_LT, fRES(tokenSecret));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * token_secret: {NotNull, VARCHAR(255)}
     * @param tokenSecret The value of tokenSecret as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTokenSecret_GreaterEqual(String tokenSecret) {
        regTokenSecret(CK_GE, fRES(tokenSecret));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * token_secret: {NotNull, VARCHAR(255)}
     * @param tokenSecret The value of tokenSecret as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTokenSecret_LessEqual(String tokenSecret) {
        regTokenSecret(CK_LE, fRES(tokenSecret));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * token_secret: {NotNull, VARCHAR(255)}
     * @param tokenSecretList The collection of tokenSecret as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTokenSecret_InScope(Collection<String> tokenSecretList) {
        doSetTokenSecret_InScope(tokenSecretList);
    }

    protected void doSetTokenSecret_InScope(Collection<String> tokenSecretList) {
        regINS(CK_INS, cTL(tokenSecretList), xgetCValueTokenSecret(), "token_secret");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * token_secret: {NotNull, VARCHAR(255)}
     * @param tokenSecretList The collection of tokenSecret as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTokenSecret_NotInScope(Collection<String> tokenSecretList) {
        doSetTokenSecret_NotInScope(tokenSecretList);
    }

    protected void doSetTokenSecret_NotInScope(Collection<String> tokenSecretList) {
        regINS(CK_NINS, cTL(tokenSecretList), xgetCValueTokenSecret(), "token_secret");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * token_secret: {NotNull, VARCHAR(255)} <br>
     * <pre>e.g. setTokenSecret_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param tokenSecret The value of tokenSecret as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setTokenSecret_LikeSearch(String tokenSecret, ConditionOptionCall<LikeSearchOption> opLambda) {
        setTokenSecret_LikeSearch(tokenSecret, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * token_secret: {NotNull, VARCHAR(255)} <br>
     * <pre>e.g. setTokenSecret_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param tokenSecret The value of tokenSecret as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setTokenSecret_LikeSearch(String tokenSecret, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(tokenSecret), xgetCValueTokenSecret(), "token_secret", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * token_secret: {NotNull, VARCHAR(255)}
     * @param tokenSecret The value of tokenSecret as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setTokenSecret_NotLikeSearch(String tokenSecret, ConditionOptionCall<LikeSearchOption> opLambda) {
        setTokenSecret_NotLikeSearch(tokenSecret, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * token_secret: {NotNull, VARCHAR(255)}
     * @param tokenSecret The value of tokenSecret as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setTokenSecret_NotLikeSearch(String tokenSecret, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(tokenSecret), xgetCValueTokenSecret(), "token_secret", likeSearchOption);
    }

    protected void regTokenSecret(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTokenSecret(), "token_secret"); }
    protected abstract ConditionValue xgetCValueTokenSecret();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * register_datetime: {NotNull, DATETIME(19)}
     * @param registerDatetime The value of registerDatetime as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setRegisterDatetime_Equal(java.time.LocalDateTime registerDatetime) {
        regRegisterDatetime(CK_EQ,  registerDatetime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * register_datetime: {NotNull, DATETIME(19)}
     * @param registerDatetime The value of registerDatetime as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRegisterDatetime_GreaterThan(java.time.LocalDateTime registerDatetime) {
        regRegisterDatetime(CK_GT,  registerDatetime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * register_datetime: {NotNull, DATETIME(19)}
     * @param registerDatetime The value of registerDatetime as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRegisterDatetime_LessThan(java.time.LocalDateTime registerDatetime) {
        regRegisterDatetime(CK_LT,  registerDatetime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * register_datetime: {NotNull, DATETIME(19)}
     * @param registerDatetime The value of registerDatetime as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRegisterDatetime_GreaterEqual(java.time.LocalDateTime registerDatetime) {
        regRegisterDatetime(CK_GE,  registerDatetime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * register_datetime: {NotNull, DATETIME(19)}
     * @param registerDatetime The value of registerDatetime as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRegisterDatetime_LessEqual(java.time.LocalDateTime registerDatetime) {
        regRegisterDatetime(CK_LE, registerDatetime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * register_datetime: {NotNull, DATETIME(19)}
     * <pre>e.g. setRegisterDatetime_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of registerDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of registerDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setRegisterDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setRegisterDatetime_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * register_datetime: {NotNull, DATETIME(19)}
     * <pre>e.g. setRegisterDatetime_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of registerDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of registerDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setRegisterDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, FromToOption fromToOption) {
        String nm = "register_datetime"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueRegisterDatetime(), nm, op);
    }

    protected void regRegisterDatetime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRegisterDatetime(), "register_datetime"); }
    protected abstract ConditionValue xgetCValueRegisterDatetime();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * register_trace: {NotNull, VARCHAR(64)}
     * @param registerTrace The value of registerTrace as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRegisterTrace_Equal(String registerTrace) {
        doSetRegisterTrace_Equal(fRES(registerTrace));
    }

    protected void doSetRegisterTrace_Equal(String registerTrace) {
        regRegisterTrace(CK_EQ, registerTrace);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * register_trace: {NotNull, VARCHAR(64)}
     * @param registerTrace The value of registerTrace as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRegisterTrace_NotEqual(String registerTrace) {
        doSetRegisterTrace_NotEqual(fRES(registerTrace));
    }

    protected void doSetRegisterTrace_NotEqual(String registerTrace) {
        regRegisterTrace(CK_NES, registerTrace);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * register_trace: {NotNull, VARCHAR(64)}
     * @param registerTrace The value of registerTrace as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRegisterTrace_GreaterThan(String registerTrace) {
        regRegisterTrace(CK_GT, fRES(registerTrace));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * register_trace: {NotNull, VARCHAR(64)}
     * @param registerTrace The value of registerTrace as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRegisterTrace_LessThan(String registerTrace) {
        regRegisterTrace(CK_LT, fRES(registerTrace));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * register_trace: {NotNull, VARCHAR(64)}
     * @param registerTrace The value of registerTrace as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRegisterTrace_GreaterEqual(String registerTrace) {
        regRegisterTrace(CK_GE, fRES(registerTrace));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * register_trace: {NotNull, VARCHAR(64)}
     * @param registerTrace The value of registerTrace as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRegisterTrace_LessEqual(String registerTrace) {
        regRegisterTrace(CK_LE, fRES(registerTrace));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * register_trace: {NotNull, VARCHAR(64)}
     * @param registerTraceList The collection of registerTrace as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRegisterTrace_InScope(Collection<String> registerTraceList) {
        doSetRegisterTrace_InScope(registerTraceList);
    }

    protected void doSetRegisterTrace_InScope(Collection<String> registerTraceList) {
        regINS(CK_INS, cTL(registerTraceList), xgetCValueRegisterTrace(), "register_trace");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * register_trace: {NotNull, VARCHAR(64)}
     * @param registerTraceList The collection of registerTrace as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRegisterTrace_NotInScope(Collection<String> registerTraceList) {
        doSetRegisterTrace_NotInScope(registerTraceList);
    }

    protected void doSetRegisterTrace_NotInScope(Collection<String> registerTraceList) {
        regINS(CK_NINS, cTL(registerTraceList), xgetCValueRegisterTrace(), "register_trace");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * register_trace: {NotNull, VARCHAR(64)} <br>
     * <pre>e.g. setRegisterTrace_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param registerTrace The value of registerTrace as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setRegisterTrace_LikeSearch(String registerTrace, ConditionOptionCall<LikeSearchOption> opLambda) {
        setRegisterTrace_LikeSearch(registerTrace, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * register_trace: {NotNull, VARCHAR(64)} <br>
     * <pre>e.g. setRegisterTrace_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param registerTrace The value of registerTrace as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setRegisterTrace_LikeSearch(String registerTrace, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(registerTrace), xgetCValueRegisterTrace(), "register_trace", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * register_trace: {NotNull, VARCHAR(64)}
     * @param registerTrace The value of registerTrace as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setRegisterTrace_NotLikeSearch(String registerTrace, ConditionOptionCall<LikeSearchOption> opLambda) {
        setRegisterTrace_NotLikeSearch(registerTrace, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * register_trace: {NotNull, VARCHAR(64)}
     * @param registerTrace The value of registerTrace as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setRegisterTrace_NotLikeSearch(String registerTrace, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(registerTrace), xgetCValueRegisterTrace(), "register_trace", likeSearchOption);
    }

    protected void regRegisterTrace(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRegisterTrace(), "register_trace"); }
    protected abstract ConditionValue xgetCValueRegisterTrace();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * update_datetime: {NotNull, DATETIME(19)}
     * @param updateDatetime The value of updateDatetime as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdateDatetime_Equal(java.time.LocalDateTime updateDatetime) {
        regUpdateDatetime(CK_EQ,  updateDatetime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * update_datetime: {NotNull, DATETIME(19)}
     * @param updateDatetime The value of updateDatetime as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdateDatetime_GreaterThan(java.time.LocalDateTime updateDatetime) {
        regUpdateDatetime(CK_GT,  updateDatetime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * update_datetime: {NotNull, DATETIME(19)}
     * @param updateDatetime The value of updateDatetime as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdateDatetime_LessThan(java.time.LocalDateTime updateDatetime) {
        regUpdateDatetime(CK_LT,  updateDatetime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * update_datetime: {NotNull, DATETIME(19)}
     * @param updateDatetime The value of updateDatetime as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdateDatetime_GreaterEqual(java.time.LocalDateTime updateDatetime) {
        regUpdateDatetime(CK_GE,  updateDatetime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * update_datetime: {NotNull, DATETIME(19)}
     * @param updateDatetime The value of updateDatetime as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdateDatetime_LessEqual(java.time.LocalDateTime updateDatetime) {
        regUpdateDatetime(CK_LE, updateDatetime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * update_datetime: {NotNull, DATETIME(19)}
     * <pre>e.g. setUpdateDatetime_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updateDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updateDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setUpdateDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setUpdateDatetime_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * update_datetime: {NotNull, DATETIME(19)}
     * <pre>e.g. setUpdateDatetime_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updateDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updateDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setUpdateDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, FromToOption fromToOption) {
        String nm = "update_datetime"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueUpdateDatetime(), nm, op);
    }

    protected void regUpdateDatetime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUpdateDatetime(), "update_datetime"); }
    protected abstract ConditionValue xgetCValueUpdateDatetime();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * update_trace: {NotNull, VARCHAR(64)}
     * @param updateTrace The value of updateTrace as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdateTrace_Equal(String updateTrace) {
        doSetUpdateTrace_Equal(fRES(updateTrace));
    }

    protected void doSetUpdateTrace_Equal(String updateTrace) {
        regUpdateTrace(CK_EQ, updateTrace);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * update_trace: {NotNull, VARCHAR(64)}
     * @param updateTrace The value of updateTrace as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdateTrace_NotEqual(String updateTrace) {
        doSetUpdateTrace_NotEqual(fRES(updateTrace));
    }

    protected void doSetUpdateTrace_NotEqual(String updateTrace) {
        regUpdateTrace(CK_NES, updateTrace);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * update_trace: {NotNull, VARCHAR(64)}
     * @param updateTrace The value of updateTrace as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdateTrace_GreaterThan(String updateTrace) {
        regUpdateTrace(CK_GT, fRES(updateTrace));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * update_trace: {NotNull, VARCHAR(64)}
     * @param updateTrace The value of updateTrace as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdateTrace_LessThan(String updateTrace) {
        regUpdateTrace(CK_LT, fRES(updateTrace));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * update_trace: {NotNull, VARCHAR(64)}
     * @param updateTrace The value of updateTrace as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdateTrace_GreaterEqual(String updateTrace) {
        regUpdateTrace(CK_GE, fRES(updateTrace));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * update_trace: {NotNull, VARCHAR(64)}
     * @param updateTrace The value of updateTrace as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdateTrace_LessEqual(String updateTrace) {
        regUpdateTrace(CK_LE, fRES(updateTrace));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * update_trace: {NotNull, VARCHAR(64)}
     * @param updateTraceList The collection of updateTrace as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdateTrace_InScope(Collection<String> updateTraceList) {
        doSetUpdateTrace_InScope(updateTraceList);
    }

    protected void doSetUpdateTrace_InScope(Collection<String> updateTraceList) {
        regINS(CK_INS, cTL(updateTraceList), xgetCValueUpdateTrace(), "update_trace");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * update_trace: {NotNull, VARCHAR(64)}
     * @param updateTraceList The collection of updateTrace as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdateTrace_NotInScope(Collection<String> updateTraceList) {
        doSetUpdateTrace_NotInScope(updateTraceList);
    }

    protected void doSetUpdateTrace_NotInScope(Collection<String> updateTraceList) {
        regINS(CK_NINS, cTL(updateTraceList), xgetCValueUpdateTrace(), "update_trace");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * update_trace: {NotNull, VARCHAR(64)} <br>
     * <pre>e.g. setUpdateTrace_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param updateTrace The value of updateTrace as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setUpdateTrace_LikeSearch(String updateTrace, ConditionOptionCall<LikeSearchOption> opLambda) {
        setUpdateTrace_LikeSearch(updateTrace, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * update_trace: {NotNull, VARCHAR(64)} <br>
     * <pre>e.g. setUpdateTrace_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param updateTrace The value of updateTrace as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setUpdateTrace_LikeSearch(String updateTrace, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(updateTrace), xgetCValueUpdateTrace(), "update_trace", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * update_trace: {NotNull, VARCHAR(64)}
     * @param updateTrace The value of updateTrace as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setUpdateTrace_NotLikeSearch(String updateTrace, ConditionOptionCall<LikeSearchOption> opLambda) {
        setUpdateTrace_NotLikeSearch(updateTrace, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * update_trace: {NotNull, VARCHAR(64)}
     * @param updateTrace The value of updateTrace as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setUpdateTrace_NotLikeSearch(String updateTrace, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(updateTrace), xgetCValueUpdateTrace(), "update_trace", likeSearchOption);
    }

    protected void regUpdateTrace(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUpdateTrace(), "update_trace"); }
    protected abstract ConditionValue xgetCValueUpdateTrace();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO = (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<DbTwitterUserCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, DbTwitterUserCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO &lt;&gt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<DbTwitterUserCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, DbTwitterUserCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br>
     * {where FOO &gt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<DbTwitterUserCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, DbTwitterUserCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br>
     * {where FOO &lt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<DbTwitterUserCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, DbTwitterUserCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br>
     * {where FOO &gt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<DbTwitterUserCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, DbTwitterUserCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;DbTwitterUserCB&gt;() {
     *     public void query(DbTwitterUserCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<DbTwitterUserCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, DbTwitterUserCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        DbTwitterUserCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(DbTwitterUserCQ sq);

    protected DbTwitterUserCB xcreateScalarConditionCB() {
        DbTwitterUserCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected DbTwitterUserCB xcreateScalarConditionPartitionByCB() {
        DbTwitterUserCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<DbTwitterUserCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        DbTwitterUserCB cb = new DbTwitterUserCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "twitter_user_id";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(DbTwitterUserCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<DbTwitterUserCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(DbTwitterUserCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        DbTwitterUserCB cb = new DbTwitterUserCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "twitter_user_id";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(DbTwitterUserCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<DbTwitterUserCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        DbTwitterUserCB cb = new DbTwitterUserCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(DbTwitterUserCQ sq);

    // ===================================================================================
    //                                                                        Manual Order
    //                                                                        ============
    /**
     * Order along manual ordering information.
     * <pre>
     * cb.query().addOrderBy_Birthdate_Asc().<span style="color: #CC4747">withManualOrder</span>(<span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_GreaterEqual</span>(priorityDate); <span style="color: #3F7E5E">// e.g. 2000/01/01</span>
     * });
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when BIRTHDATE &gt;= '2000/01/01' then 0</span>
     * <span style="color: #3F7E5E">//     else 1</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     *
     * cb.query().addOrderBy_MemberStatusCode_Asc().<span style="color: #CC4747">withManualOrder</span>(<span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Withdrawal);
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Formalized);
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Provisional);
     * });
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'WDL' then 0</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'FML' then 1</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'PRV' then 2</span>
     * <span style="color: #3F7E5E">//     else 3</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     * </pre>
     * <p>This function with Union is unsupported!</p>
     * <p>The order values are bound (treated as bind parameter).</p>
     * @param opLambda The callback for option of manual-order containing order values. (NotNull)
     */
    public void withManualOrder(ManualOrderOptionCall opLambda) { // is user public!
        xdoWithManualOrder(cMOO(opLambda));
    }

    // ===================================================================================
    //                                                                    Small Adjustment
    //                                                                    ================
    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    protected DbTwitterUserCB newMyCB() {
        return new DbTwitterUserCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return DbTwitterUserCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
