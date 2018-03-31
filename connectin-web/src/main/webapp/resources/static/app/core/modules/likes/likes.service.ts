import {Inject, Injectable} from "angular2/core";
import {Http, RequestOptions} from "angular2/http";
import {RequestHeaderService} from "../../../common/sevices/request-header.service";
import {UrlConfigService} from "../../../config/url-config.service";

@Injectable()
export class LikeService {
    constructor(private http: Http,
                @Inject(RequestHeaderService) private requestHeaderService:RequestHeaderService,
                @Inject(UrlConfigService) private urlConfig: UrlConfigService) {

    }

    likePost(postId) {
        let options = new RequestOptions({headers: this.requestHeaderService.getBasicAuthHeader()});
        return this.http.post(this.urlConfig.baseUrl+this.urlConfig.likePostUrl+"/"+postId, options);
    }
    likeComment(commentId) {
        let options = new RequestOptions({headers: this.requestHeaderService.getBasicAuthHeader()});
        return this.http.post(this.urlConfig.baseUrl+this.urlConfig.likeCommentUrl+"/"+commentId, options);
    }
}