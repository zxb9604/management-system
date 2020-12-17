function jump(name){
    if(userName == null) {
        location.href = "/";
    }else if(name != null) {
        location.href = "/jump/" + name;
    }
}