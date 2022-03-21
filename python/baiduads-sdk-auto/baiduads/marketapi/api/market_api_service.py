"""
    dev2 api schema

    'dev2.baidu.com' api schema  # noqa: E501

Generated by: https://openapi-generator.tech
"""


import re  # noqa: F401
import sys  # noqa: F401

from baiduads.api_client import ApiClient, Endpoint as _Endpoint
from baiduads.model_utils import (  # noqa: F401
    check_allowed_values,
    check_validations,
    date,
    datetime,
    file_type,
    none_type,
    validate_and_convert_types
)
from baiduads.marketapi.model.cancel_order_request_wrapper import CancelOrderRequestWrapper
from baiduads.marketapi.model.cancel_order_response_wrapper import CancelOrderResponseWrapper
from baiduads.marketapi.model.create_order_request_wrapper import CreateOrderRequestWrapper
from baiduads.marketapi.model.create_order_response_wrapper import CreateOrderResponseWrapper
from baiduads.marketapi.model.get_order_info_request_wrapper import GetOrderInfoRequestWrapper
from baiduads.marketapi.model.get_order_info_response_wrapper import GetOrderInfoResponseWrapper
from baiduads.marketapi.model.get_site_info_request_wrapper import GetSiteInfoRequestWrapper
from baiduads.marketapi.model.get_site_info_response_wrapper import GetSiteInfoResponseWrapper
from baiduads.marketapi.model.preview_site_request_wrapper import PreviewSiteRequestWrapper
from baiduads.marketapi.model.preview_site_response_wrapper import PreviewSiteResponseWrapper


class MarketApiService(object):
    """NOTE: This class is auto generated by OpenAPI Generator
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client
        self.cancel_order_endpoint = _Endpoint(
            settings={
                'response_type': (CancelOrderResponseWrapper,),
                'auth': [],
                'endpoint_path': '/json/sms/service/MarketApiService/cancelOrder',
                'operation_id': 'cancel_order',
                'http_method': 'POST',
                'servers': None,
            },
            params_map={
                'all': [
                    'cancel_order_request_wrapper',
                ],
                'required': [
                    'cancel_order_request_wrapper',
                ],
                'nullable': [
                ],
                'enum': [
                ],
                'validation': [
                ]
            },
            root_map={
                'validations': {
                },
                'allowed_values': {
                },
                'openapi_types': {
                    'cancel_order_request_wrapper':
                        (CancelOrderRequestWrapper,),
                },
                'attribute_map': {
                },
                'location_map': {
                    'cancel_order_request_wrapper': 'body',
                },
                'collection_format_map': {
                }
            },
            headers_map={
                'accept': [
                    'application/json;charset=UTF-8'
                ],
                'content_type': [
                    'application/json;charset=UTF-8'
                ]
            },
            api_client=api_client
        )
        self.create_order_endpoint = _Endpoint(
            settings={
                'response_type': (CreateOrderResponseWrapper,),
                'auth': [],
                'endpoint_path': '/json/sms/service/MarketApiService/createOrder',
                'operation_id': 'create_order',
                'http_method': 'POST',
                'servers': None,
            },
            params_map={
                'all': [
                    'create_order_request_wrapper',
                ],
                'required': [
                    'create_order_request_wrapper',
                ],
                'nullable': [
                ],
                'enum': [
                ],
                'validation': [
                ]
            },
            root_map={
                'validations': {
                },
                'allowed_values': {
                },
                'openapi_types': {
                    'create_order_request_wrapper':
                        (CreateOrderRequestWrapper,),
                },
                'attribute_map': {
                },
                'location_map': {
                    'create_order_request_wrapper': 'body',
                },
                'collection_format_map': {
                }
            },
            headers_map={
                'accept': [
                    'application/json;charset=UTF-8'
                ],
                'content_type': [
                    'application/json;charset=UTF-8'
                ]
            },
            api_client=api_client
        )
        self.get_order_info_endpoint = _Endpoint(
            settings={
                'response_type': (GetOrderInfoResponseWrapper,),
                'auth': [],
                'endpoint_path': '/json/sms/service/MarketApiService/getOrderInfo',
                'operation_id': 'get_order_info',
                'http_method': 'POST',
                'servers': None,
            },
            params_map={
                'all': [
                    'get_order_info_request_wrapper',
                ],
                'required': [
                    'get_order_info_request_wrapper',
                ],
                'nullable': [
                ],
                'enum': [
                ],
                'validation': [
                ]
            },
            root_map={
                'validations': {
                },
                'allowed_values': {
                },
                'openapi_types': {
                    'get_order_info_request_wrapper':
                        (GetOrderInfoRequestWrapper,),
                },
                'attribute_map': {
                },
                'location_map': {
                    'get_order_info_request_wrapper': 'body',
                },
                'collection_format_map': {
                }
            },
            headers_map={
                'accept': [
                    'application/json;charset=UTF-8'
                ],
                'content_type': [
                    'application/json;charset=UTF-8'
                ]
            },
            api_client=api_client
        )
        self.get_site_info_endpoint = _Endpoint(
            settings={
                'response_type': (GetSiteInfoResponseWrapper,),
                'auth': [],
                'endpoint_path': '/json/sms/service/MarketApiService/getSiteInfo',
                'operation_id': 'get_site_info',
                'http_method': 'POST',
                'servers': None,
            },
            params_map={
                'all': [
                    'get_site_info_request_wrapper',
                ],
                'required': [
                    'get_site_info_request_wrapper',
                ],
                'nullable': [
                ],
                'enum': [
                ],
                'validation': [
                ]
            },
            root_map={
                'validations': {
                },
                'allowed_values': {
                },
                'openapi_types': {
                    'get_site_info_request_wrapper':
                        (GetSiteInfoRequestWrapper,),
                },
                'attribute_map': {
                },
                'location_map': {
                    'get_site_info_request_wrapper': 'body',
                },
                'collection_format_map': {
                }
            },
            headers_map={
                'accept': [
                    'application/json;charset=UTF-8'
                ],
                'content_type': [
                    'application/json;charset=UTF-8'
                ]
            },
            api_client=api_client
        )
        self.preview_site_endpoint = _Endpoint(
            settings={
                'response_type': (PreviewSiteResponseWrapper,),
                'auth': [],
                'endpoint_path': '/json/sms/service/MarketApiService/previewSite',
                'operation_id': 'preview_site',
                'http_method': 'POST',
                'servers': None,
            },
            params_map={
                'all': [
                    'preview_site_request_wrapper',
                ],
                'required': [
                    'preview_site_request_wrapper',
                ],
                'nullable': [
                ],
                'enum': [
                ],
                'validation': [
                ]
            },
            root_map={
                'validations': {
                },
                'allowed_values': {
                },
                'openapi_types': {
                    'preview_site_request_wrapper':
                        (PreviewSiteRequestWrapper,),
                },
                'attribute_map': {
                },
                'location_map': {
                    'preview_site_request_wrapper': 'body',
                },
                'collection_format_map': {
                }
            },
            headers_map={
                'accept': [
                    'application/json;charset=UTF-8'
                ],
                'content_type': [
                    'application/json;charset=UTF-8'
                ]
            },
            api_client=api_client
        )

    def cancel_order(
        self,
        cancel_order_request_wrapper,
        **kwargs
    ):
        """cancel_order  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.cancel_order(cancel_order_request_wrapper, async_req=True)
        >>> result = thread.get()

        Args:
            cancel_order_request_wrapper (CancelOrderRequestWrapper):

        Keyword Args:
            _return_http_data_only (bool): response data without head status
                code and headers. Default is True.
            _preload_content (bool): if False, the urllib3.HTTPResponse object
                will be returned without reading/decoding response data.
                Default is True.
            _request_timeout (int/float/tuple): timeout setting for this request. If
                one number provided, it will be total request timeout. It can also
                be a pair (tuple) of (connection, read) timeouts.
                Default is None.
            _check_input_type (bool): specifies if type checking
                should be done one the data sent to the server.
                Default is True.
            _check_return_type (bool): specifies if type checking
                should be done one the data received from the server.
                Default is True.
            _content_type (str/None): force body content-type.
                Default is None and content-type will be predicted by allowed
                content-types and body.
            _host_index (int/None): specifies the index of the server
                that we want to use.
                Default is read from the configuration.
            async_req (bool): execute request asynchronously

        Returns:
            CancelOrderResponseWrapper
                If the method is called asynchronously, returns the request
                thread.
        """
        kwargs['async_req'] = kwargs.get(
            'async_req', False
        )
        kwargs['_return_http_data_only'] = kwargs.get(
            '_return_http_data_only', True
        )
        kwargs['_preload_content'] = kwargs.get(
            '_preload_content', True
        )
        kwargs['_request_timeout'] = kwargs.get(
            '_request_timeout', None
        )
        kwargs['_check_input_type'] = kwargs.get(
            '_check_input_type', True
        )
        kwargs['_check_return_type'] = kwargs.get(
            '_check_return_type', True
        )
        kwargs['_spec_property_naming'] = kwargs.get(
            '_spec_property_naming', False
        )
        kwargs['_content_type'] = kwargs.get(
            '_content_type')
        kwargs['_host_index'] = kwargs.get('_host_index')
        kwargs['cancel_order_request_wrapper'] = \
            cancel_order_request_wrapper
        return self.cancel_order_endpoint.call_with_http_info(**kwargs)

    def create_order(
        self,
        create_order_request_wrapper,
        **kwargs
    ):
        """create_order  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.create_order(create_order_request_wrapper, async_req=True)
        >>> result = thread.get()

        Args:
            create_order_request_wrapper (CreateOrderRequestWrapper):

        Keyword Args:
            _return_http_data_only (bool): response data without head status
                code and headers. Default is True.
            _preload_content (bool): if False, the urllib3.HTTPResponse object
                will be returned without reading/decoding response data.
                Default is True.
            _request_timeout (int/float/tuple): timeout setting for this request. If
                one number provided, it will be total request timeout. It can also
                be a pair (tuple) of (connection, read) timeouts.
                Default is None.
            _check_input_type (bool): specifies if type checking
                should be done one the data sent to the server.
                Default is True.
            _check_return_type (bool): specifies if type checking
                should be done one the data received from the server.
                Default is True.
            _content_type (str/None): force body content-type.
                Default is None and content-type will be predicted by allowed
                content-types and body.
            _host_index (int/None): specifies the index of the server
                that we want to use.
                Default is read from the configuration.
            async_req (bool): execute request asynchronously

        Returns:
            CreateOrderResponseWrapper
                If the method is called asynchronously, returns the request
                thread.
        """
        kwargs['async_req'] = kwargs.get(
            'async_req', False
        )
        kwargs['_return_http_data_only'] = kwargs.get(
            '_return_http_data_only', True
        )
        kwargs['_preload_content'] = kwargs.get(
            '_preload_content', True
        )
        kwargs['_request_timeout'] = kwargs.get(
            '_request_timeout', None
        )
        kwargs['_check_input_type'] = kwargs.get(
            '_check_input_type', True
        )
        kwargs['_check_return_type'] = kwargs.get(
            '_check_return_type', True
        )
        kwargs['_spec_property_naming'] = kwargs.get(
            '_spec_property_naming', False
        )
        kwargs['_content_type'] = kwargs.get(
            '_content_type')
        kwargs['_host_index'] = kwargs.get('_host_index')
        kwargs['create_order_request_wrapper'] = \
            create_order_request_wrapper
        return self.create_order_endpoint.call_with_http_info(**kwargs)

    def get_order_info(
        self,
        get_order_info_request_wrapper,
        **kwargs
    ):
        """get_order_info  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.get_order_info(get_order_info_request_wrapper, async_req=True)
        >>> result = thread.get()

        Args:
            get_order_info_request_wrapper (GetOrderInfoRequestWrapper):

        Keyword Args:
            _return_http_data_only (bool): response data without head status
                code and headers. Default is True.
            _preload_content (bool): if False, the urllib3.HTTPResponse object
                will be returned without reading/decoding response data.
                Default is True.
            _request_timeout (int/float/tuple): timeout setting for this request. If
                one number provided, it will be total request timeout. It can also
                be a pair (tuple) of (connection, read) timeouts.
                Default is None.
            _check_input_type (bool): specifies if type checking
                should be done one the data sent to the server.
                Default is True.
            _check_return_type (bool): specifies if type checking
                should be done one the data received from the server.
                Default is True.
            _content_type (str/None): force body content-type.
                Default is None and content-type will be predicted by allowed
                content-types and body.
            _host_index (int/None): specifies the index of the server
                that we want to use.
                Default is read from the configuration.
            async_req (bool): execute request asynchronously

        Returns:
            GetOrderInfoResponseWrapper
                If the method is called asynchronously, returns the request
                thread.
        """
        kwargs['async_req'] = kwargs.get(
            'async_req', False
        )
        kwargs['_return_http_data_only'] = kwargs.get(
            '_return_http_data_only', True
        )
        kwargs['_preload_content'] = kwargs.get(
            '_preload_content', True
        )
        kwargs['_request_timeout'] = kwargs.get(
            '_request_timeout', None
        )
        kwargs['_check_input_type'] = kwargs.get(
            '_check_input_type', True
        )
        kwargs['_check_return_type'] = kwargs.get(
            '_check_return_type', True
        )
        kwargs['_spec_property_naming'] = kwargs.get(
            '_spec_property_naming', False
        )
        kwargs['_content_type'] = kwargs.get(
            '_content_type')
        kwargs['_host_index'] = kwargs.get('_host_index')
        kwargs['get_order_info_request_wrapper'] = \
            get_order_info_request_wrapper
        return self.get_order_info_endpoint.call_with_http_info(**kwargs)

    def get_site_info(
        self,
        get_site_info_request_wrapper,
        **kwargs
    ):
        """get_site_info  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.get_site_info(get_site_info_request_wrapper, async_req=True)
        >>> result = thread.get()

        Args:
            get_site_info_request_wrapper (GetSiteInfoRequestWrapper):

        Keyword Args:
            _return_http_data_only (bool): response data without head status
                code and headers. Default is True.
            _preload_content (bool): if False, the urllib3.HTTPResponse object
                will be returned without reading/decoding response data.
                Default is True.
            _request_timeout (int/float/tuple): timeout setting for this request. If
                one number provided, it will be total request timeout. It can also
                be a pair (tuple) of (connection, read) timeouts.
                Default is None.
            _check_input_type (bool): specifies if type checking
                should be done one the data sent to the server.
                Default is True.
            _check_return_type (bool): specifies if type checking
                should be done one the data received from the server.
                Default is True.
            _content_type (str/None): force body content-type.
                Default is None and content-type will be predicted by allowed
                content-types and body.
            _host_index (int/None): specifies the index of the server
                that we want to use.
                Default is read from the configuration.
            async_req (bool): execute request asynchronously

        Returns:
            GetSiteInfoResponseWrapper
                If the method is called asynchronously, returns the request
                thread.
        """
        kwargs['async_req'] = kwargs.get(
            'async_req', False
        )
        kwargs['_return_http_data_only'] = kwargs.get(
            '_return_http_data_only', True
        )
        kwargs['_preload_content'] = kwargs.get(
            '_preload_content', True
        )
        kwargs['_request_timeout'] = kwargs.get(
            '_request_timeout', None
        )
        kwargs['_check_input_type'] = kwargs.get(
            '_check_input_type', True
        )
        kwargs['_check_return_type'] = kwargs.get(
            '_check_return_type', True
        )
        kwargs['_spec_property_naming'] = kwargs.get(
            '_spec_property_naming', False
        )
        kwargs['_content_type'] = kwargs.get(
            '_content_type')
        kwargs['_host_index'] = kwargs.get('_host_index')
        kwargs['get_site_info_request_wrapper'] = \
            get_site_info_request_wrapper
        return self.get_site_info_endpoint.call_with_http_info(**kwargs)

    def preview_site(
        self,
        preview_site_request_wrapper,
        **kwargs
    ):
        """preview_site  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.preview_site(preview_site_request_wrapper, async_req=True)
        >>> result = thread.get()

        Args:
            preview_site_request_wrapper (PreviewSiteRequestWrapper):

        Keyword Args:
            _return_http_data_only (bool): response data without head status
                code and headers. Default is True.
            _preload_content (bool): if False, the urllib3.HTTPResponse object
                will be returned without reading/decoding response data.
                Default is True.
            _request_timeout (int/float/tuple): timeout setting for this request. If
                one number provided, it will be total request timeout. It can also
                be a pair (tuple) of (connection, read) timeouts.
                Default is None.
            _check_input_type (bool): specifies if type checking
                should be done one the data sent to the server.
                Default is True.
            _check_return_type (bool): specifies if type checking
                should be done one the data received from the server.
                Default is True.
            _content_type (str/None): force body content-type.
                Default is None and content-type will be predicted by allowed
                content-types and body.
            _host_index (int/None): specifies the index of the server
                that we want to use.
                Default is read from the configuration.
            async_req (bool): execute request asynchronously

        Returns:
            PreviewSiteResponseWrapper
                If the method is called asynchronously, returns the request
                thread.
        """
        kwargs['async_req'] = kwargs.get(
            'async_req', False
        )
        kwargs['_return_http_data_only'] = kwargs.get(
            '_return_http_data_only', True
        )
        kwargs['_preload_content'] = kwargs.get(
            '_preload_content', True
        )
        kwargs['_request_timeout'] = kwargs.get(
            '_request_timeout', None
        )
        kwargs['_check_input_type'] = kwargs.get(
            '_check_input_type', True
        )
        kwargs['_check_return_type'] = kwargs.get(
            '_check_return_type', True
        )
        kwargs['_spec_property_naming'] = kwargs.get(
            '_spec_property_naming', False
        )
        kwargs['_content_type'] = kwargs.get(
            '_content_type')
        kwargs['_host_index'] = kwargs.get('_host_index')
        kwargs['preview_site_request_wrapper'] = \
            preview_site_request_wrapper
        return self.preview_site_endpoint.call_with_http_info(**kwargs)

