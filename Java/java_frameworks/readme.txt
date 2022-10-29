need to add this to security configuration java file in order to allow the new endpoint to be accessible online:
/api/customer").permitAll()

url to access new endpoint:
http://localhost:8080/api/customer?id=1
