public class ChatUser {
// Имя пользователя
private String name;
public int numMsg;
// Последнее время взаимодействия с сервером в количестве микросекунд,
// прошедших с 1 января 1970 года
private long lastInteractionTime;
// Идентификатор Java-сессии пользователя
private String sessionId;
public ChatUser(String name,long lastInteractionTime,String sessionId) {
super();
this.name = name;
this.lastInteractionTime = lastInteractionTime;
this.sessionId = sessionId;
this.numMsg=0;
}
public String getName() {
return name;
}
public int getNumMsg() {
return numMsg;
}
public void setName(String name) {
this.name = name;
}
public long getLastInteractionTime() {
return lastInteractionTime;
}
public void setLastInteractionTime(long lastInteractionTime) {
this.lastInteractionTime = lastInteractionTime;
}
public String getSessionId() {
return sessionId;
}
public void setSessionId(String sessionId) {
this.sessionId = sessionId;
}
public void setNumMsg(int numMs) {
this.numMsg=numMs;
}
}