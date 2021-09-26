package com.hrms.hrms.core.adapters.abstracts;

import com.hrms.hrms.entities.concretes.Candidate;

import javax.xml.rpc.ServiceException;
import java.rmi.RemoteException;

public interface MernisService {
    public boolean checkIfRealPerson(String idNumber, String firstName, String lastName, int birthYear) throws ServiceException, RemoteException;
}
