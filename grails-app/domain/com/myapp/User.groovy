package com.myapp

class User {

    String username
    String password

    static belongsTo = [account: Account]

    static constraints = {
    }

    // TODO: uncomment the following mapping to simulate 'no open session' exception
    static mapping = {
        account lazy: false
    }

    public String getLabel() {
        return "$username - $account.name"
    }
}
