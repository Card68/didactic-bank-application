/*
 * Created on 16 Dec 2013 16:15:46
 */
package bank.business.domain;

import java.util.Date;
import java.util.List;

/**
 * @author Ingrid Nunes
 * 
 */
public interface AccountOperationService {

	public Deposit deposit(long operationLocation, long branch,
			long accountNumber, long envelope, double amount)
			throws BusinessException;

	public double getBalance(long branch, long accountNumber)
			throws BusinessException;

	public List<Transaction> getStatementByDate(long branch,
			long accountNumber, Date begin, Date end) throws BusinessException;

	public List<Transaction> getStatementByMonth(long branch,
			long accountNumber, int month, int year) throws BusinessException;

	public CurrentAccount login(long branch, long accountNumber, String password)
			throws BusinessException;

	public Transfer transfer(long operationLocation, long srcBranch,
			long srcAccountNumber, long dstBranch, long dstAccountNumber,
			double amount) throws BusinessException;

	public Withdrawal withdrawal(long operationLocation, long branch,
			long accountNumber, double amount) throws BusinessException;

}
